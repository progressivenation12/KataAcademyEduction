package org.javaCore.module4;

import java.util.Objects;
import java.util.logging.Level;

public class Task_4_4_09 {
    public static void main(String[] args) {

    }

    public interface Sendable {
        String getFrom();

        String getTo();
    }

    public static abstract class AbstractSendable implements Sendable {
        protected final String from;
        protected final String to;

        public AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AbstractSendable that = (AbstractSendable) o;

            if (!from.equals(that.from)) return false;
            return to.equals(that.to);
        }

    }

    public static class MailMessage extends AbstractSendable {
        private final String message;

        public MailMessage(String from, String to, String message) {
            super(from, to);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailMessage that = (MailMessage) o;

            return Objects.equals(message, that.message);
        }

    }

    public static class MailPackage extends AbstractSendable {
        private final Package content;

        public MailPackage(String from, String to, Package content) {
            super(from, to);
            this.content = content;
        }

        public Package getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailPackage that = (MailPackage) o;

            if (!content.equals(that.content)) return false;

            return true;
        }

    }

    public record Package(String content, int price) {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Package aPackage = (Package) o;

            if (price != aPackage.price) return false;
            if (!content.equals(aPackage.content)) return false;

            return true;
        }
    }

    public interface MailService {
        Sendable processMail(Sendable mail);
    }

    public static class RealMailService implements MailService {
        @Override
        public Sendable processMail(Sendable mail) {
            // Здесь описан код настоящей системы отправки почты.
            return mail;
        }
    }

    public static class UntrustworthyMailWorker implements MailService {
        private final MailService[] msArray;
        private final RealMailService mRealMailService;

        public UntrustworthyMailWorker(MailService[] mService) {
            msArray = mService;
            mRealMailService = new RealMailService();
        }

        public RealMailService getRealMailService() {
            return mRealMailService;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            Sendable buff = null;
            for (int i = 0; i < this.msArray.length; i++) {

                if (i == 0) {
                    buff = this.msArray[0].processMail(mail);
                    continue;
                }

                buff = this.msArray[i].processMail(buff);
            }
            return getRealMailService().processMail(buff);
        }
    }

    public static class Spy implements MailService {
        private static java.util.logging.Logger SpyLogger = null;

        public Spy(java.util.logging.Logger msLogger) {
            SpyLogger = msLogger;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailMessage) {
                if (mail.getFrom().equals("Austin Powers") || mail.getTo().equals("Austin Powers")) {
                    SpyLogger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"", new Object[]{mail.getFrom(), mail.getTo(), ((MailMessage) mail).getMessage()});
                } else {
                    SpyLogger.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[]{mail.getFrom(), mail.getTo()});
                }
            }
            return mail;
        }
    }

    public static class Inspector implements MailService {
        public Inspector() {
        }

        @Override
        public Sendable processMail(Sendable mail) throws IllegalPackageException, StolenPackageException {
            String mpContent;
            if (mail instanceof MailPackage) {
                mpContent = ((MailPackage) mail).getContent().content();
                if (mpContent.contains("weapons") || mpContent.contains("banned substance")) {
                    throw new IllegalPackageException();
                }
                if (mpContent.contains("stones")) {
                    throw new StolenPackageException();
                }
            }
            return mail;
        }
    }

    public static class Thief implements MailService {
        private final int costValue;
        private int totalCost;
        MailPackage mailPackage;

        public Thief(int value) {
            this.costValue = value;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                if (((MailPackage) mail).getContent().price() >= costValue) {
                    totalCost += ((MailPackage) mail).getContent().price();
                    mailPackage = new MailPackage(mail.getFrom(), mail.getTo(),
                            new Package("stones instead of " + (((MailPackage) mail).getContent().content()).toString(), 0));
                    return mailPackage;
                } else {
                    return (MailPackage) mail;
                }
            }
            return mail;
        }

        public int getStolenValue() {
            return totalCost;
        }
    }

    public static class StolenPackageException extends RuntimeException {
        public StolenPackageException() {
        }

        public StolenPackageException(String message) {
            super(message);
        }

        public StolenPackageException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static class IllegalPackageException extends RuntimeException {
        public IllegalPackageException() {
        }

        public IllegalPackageException(String message) {
            super(message);
        }

        public IllegalPackageException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}

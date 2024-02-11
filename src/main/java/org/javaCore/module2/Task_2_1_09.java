package org.javaCore.module2;

public class Task_2_1_09 {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);

        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

    }

    public static class ComplexNumber {
        private final double re;
        private final double im;

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ComplexNumber that = (ComplexNumber) o;

            if (Double.compare(that.re, getRe()) != 0) {
                return false;
            }

            return Double.compare(that.im, getIm()) == 0;
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            temp = Double.doubleToLongBits(re);
            result = (int) (temp ^ (temp >>> 32));
            temp = Double.doubleToLongBits(im);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }
    }
}

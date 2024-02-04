package org.javaCore;

public class Task_2_3_11 {
    public static void main(String[] args) {
        Human nameIvan = new Human("Секрет", "Новости", "Опыт", "Сплетни");

        System.out.println(nameIvan.getNews());
        System.out.println(nameIvan.getExperience());
        System.out.println(nameIvan.getGossip());
    }

    static class Human {
        private final String secret; //секретики
        private final String news; //новости
        private final String experience; //опыт
        private final String gossip; //сплетни

        public Human(String secret, String news, String experience, String gossip) {
            this.secret = secret;
            this.news = news;
            this.experience = experience;
            this.gossip = gossip;
        }

        private String getSecret() {
            return secret;
        }

        public String getNews() {
            return news;
        }

        protected String getExperience() {
            return experience;
        }

        String getGossip() {
            System.out.println(getSecret());
            return gossip;
        }
    }
}


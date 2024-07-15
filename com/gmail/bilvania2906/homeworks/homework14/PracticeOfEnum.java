package com.gmail.bilvania2906.homeworks.homework14;

public class PracticeOfEnum {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    interface AdviceProvider {
        void advise(Day day);
    }

    static class WeeklyAdvice implements AdviceProvider {
        @Override
        public void advise(Day day) {
            switch (day) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                    System.out.println("Be productive at work!");
                    break;
                case FRIDAY:
                    System.out.println("Happy Friday!");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("I recommend visiting a park or museum!");
                    break;
                default:
                    System.out.println("Invalid day of the week!");
            }
        }
    }

        public static void main(String[] args) {
            AdviceProvider adviceProvider = new WeeklyAdvice();

            for (Day day : Day.values()) {
                System.out.print(day + ": ");
                adviceProvider.advise(day);
            }
        }
    }


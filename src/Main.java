public class Main {
    public static void main(String[] args) {
        for (Event event : getMovie()) {
            validateEvent(event);
        }

        for (Event event : getTheatre()) {
            validateEvent(event);
        }
        System.out.println("Все события корректны!");
    }

    public static Movie[] getMovie() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
                new Movie("Властелен колец: Братство кольца", 2001, 12),
                new Movie("Джокер", 2019, 16)
        };
    }

    public static Theatre[] getTheatre() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Inferno", 2008, 16),
                new Theatre("Einstein on the Beach", 1979, 18)
        };
    }

    public static void validateEvent(Event event) {
        if (event.getTitle().length() == 0 || event.getReleaseYear() <= 0 || event.getAgeLimit() <= 0) {
            throw new RuntimeException("Одно из полей не заполнено или запоненно не корректно!");
        }
    }
}
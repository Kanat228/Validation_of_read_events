public abstract class Event {
    private final String title;
    private final int releaseYear;
    private final int ageLimit;

    public Event(String title, int releaseYear, int ageLimit) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.ageLimit = ageLimit;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", ageLimit=" + ageLimit +
                '}';
    }
}
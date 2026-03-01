package com.venkatesh.springoot.learnspringboot;

public class Film {
    private long id;
    private String name;
    private String director;

    public Film(long id, String name, String director) {
        this.id = id;
        this.name = name;
        this.director = director;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Film{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", director='").append(director).append('\'');
        sb.append('}');
        return sb.toString();
    }

}

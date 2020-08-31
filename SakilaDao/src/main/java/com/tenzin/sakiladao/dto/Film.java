package com.tenzin.sakiladao.dto;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author Tenzin Woesel Aug 11, 2020
 */
public class Film {

    private int filmId;

    private String title;

    private String description;

    private int releaseYear;

    private LocalDateTime lastUpdate;

    public Film() {
    }

    public Film(int filmId, String title, String description, int releaseYear, LocalDateTime lastUpdate) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.lastUpdate = lastUpdate;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.filmId;
        hash = 59 * hash + Objects.hashCode(this.title);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + this.releaseYear;
        hash = 59 * hash + Objects.hashCode(this.lastUpdate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Film other = (Film) obj;
        if (this.filmId != other.filmId) {
            return false;
        }
        if (this.releaseYear != other.releaseYear) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.lastUpdate, other.lastUpdate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Film{" + "filmId=" + filmId + ", title=" + title + ", description=" + description + ", releaseYear=" + releaseYear + ", lastUpdate=" + lastUpdate + '}';
    }

}

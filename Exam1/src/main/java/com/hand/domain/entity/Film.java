package com.hand.domain.entity;

import org.springframework.format.annotation.DateTimeFormat;
import tk.mybatis.mapper.annotation.KeySql;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "film")
public class Film extends BaseEntity {
    @Id
    @KeySql(useGeneratedKeys = true)
    @Column(name = "film_id")
    private Short filmId;

    private String title;

    @DateTimeFormat(pattern = "yyyy")
    @Column(name = "release_year")
    private String releaseYear;

    @Column(name = "language_id")
    private Byte languageId;

    @Column(name = "original_language_id")
    private Byte originalLanguageId;

    @Column(name = "rental_duration")
    private Byte rentalDuration;

    @Column(name = "rental_rate")
    private BigDecimal rentalRate;

    private Short length;

    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;

    private String rating;

    @Column(name = "special_features")
    private String specialFeatures;

    private String description;

    /**
     * @return film_id
     */
    public Short getFilmId() {
        return filmId;
    }

    /**
     * @param filmId
     */
    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return release_year
     */
    public String getReleaseYear() {
        return releaseYear;
    }

    /**
     * @param releaseYear
     */
    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * @return language_id
     */
    public Byte getLanguageId() {
        return languageId;
    }

    /**
     * @param languageId
     */
    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    /**
     * @return original_language_id
     */
    public Byte getOriginalLanguageId() {
        return originalLanguageId;
    }

    /**
     * @param originalLanguageId
     */
    public void setOriginalLanguageId(Byte originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    /**
     * @return rental_duration
     */
    public Byte getRentalDuration() {
        return rentalDuration;
    }

    /**
     * @param rentalDuration
     */
    public void setRentalDuration(Byte rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    /**
     * @return rental_rate
     */
    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    /**
     * @param rentalRate
     */
    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    /**
     * @return length
     */
    public Short getLength() {
        return length;
    }

    /**
     * @param length
     */
    public void setLength(Short length) {
        this.length = length;
    }

    /**
     * @return replacement_cost
     */
    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    /**
     * @param replacementCost
     */
    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    /**
     * @return rating
     */
    public String getRating() {
        return rating;
    }

    /**
     * @param rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * @return special_features
     */
    public String getSpecialFeatures() {
        return specialFeatures;
    }

    /**
     * @param specialFeatures
     */
    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", languageId=" + languageId +
                ", originalLanguageId=" + originalLanguageId +
                ", rentalDuration=" + rentalDuration +
                ", rentalRate=" + rentalRate +
                ", length=" + length +
                ", replacementCost=" + replacementCost +
                ", rating='" + rating + '\'' +
                ", specialFeatures='" + specialFeatures + '\'' +
                ", description='" + description + '\'' +
                ", lastUpdate=" + getLastUpdate() +
                '}';
    }
}
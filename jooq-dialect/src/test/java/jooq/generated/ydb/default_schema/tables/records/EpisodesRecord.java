/*
 * This file is generated by jOOQ.
 */
package jooq.generated.ydb.default_schema.tables.records;


import jooq.generated.ydb.default_schema.tables.Episodes;

import org.jooq.Record3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class EpisodesRecord extends UpdatableRecordImpl<EpisodesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DEFAULT_SCHEMA.episodes.series_id</code>.
     */
    public void setSeriesId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.episodes.series_id</code>.
     */
    public ULong getSeriesId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>DEFAULT_SCHEMA.episodes.season_id</code>.
     */
    public void setSeasonId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.episodes.season_id</code>.
     */
    public ULong getSeasonId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>DEFAULT_SCHEMA.episodes.episode_id</code>.
     */
    public void setEpisodeId(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.episodes.episode_id</code>.
     */
    public ULong getEpisodeId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>DEFAULT_SCHEMA.episodes.title</code>.
     */
    public void setTitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.episodes.title</code>.
     */
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DEFAULT_SCHEMA.episodes.air_date</code>.
     */
    public void setAirDate(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>DEFAULT_SCHEMA.episodes.air_date</code>.
     */
    public ULong getAirDate() {
        return (ULong) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<ULong, ULong, ULong> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EpisodesRecord
     */
    public EpisodesRecord() {
        super(Episodes.EPISODES);
    }

    /**
     * Create a detached, initialised EpisodesRecord
     */
    public EpisodesRecord(ULong seriesId, ULong seasonId, ULong episodeId, String title, ULong airDate) {
        super(Episodes.EPISODES);

        setSeriesId(seriesId);
        setSeasonId(seasonId);
        setEpisodeId(episodeId);
        setTitle(title);
        setAirDate(airDate);
        resetChangedOnNotNull();
    }
}

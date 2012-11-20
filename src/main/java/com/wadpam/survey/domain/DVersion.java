package com.wadpam.survey.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 * A version of a survey
 * @author os
 */
@Entity
public class DVersion extends AbstractLongEntity {
    
    /** DRAFT, PUBLISHED, DELETED */
    @Basic
    private Long state;
    
    /** The description of this survey version */
    @Basic
    private String description;

    /** The reference to the survey */
    @ManyToOne
    private DSurvey survey;
    
    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DSurvey getSurvey() {
        return survey;
    }

    public void setSurvey(DSurvey survey) {
        this.survey = survey;
    }

}

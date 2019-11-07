package com.example.comicstorespringbootmvn.grading;


import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author carlvdl
 */
@Entity
@Table(name = "grading")
public class Grading implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "grading_id")
    private Integer gradingId;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "code")
    private String code;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "description")
    private String description;

    @Column(name = "date_added")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdded;

    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;

//    @OneToMany(mappedBy = "gradingId")
//    private Collection<Item> itemCollection;

    public Grading() {
    }

    public Grading(Integer gradingId) {
        this.gradingId = gradingId;
    }

    public Grading(Integer gradingId, String code, String description) {
        this.gradingId = gradingId;
        this.code = code;
        this.description = description;
    }

    public Integer getGradingId() {
        return gradingId;
    }

    public void setGradingId(Integer gradingId) {
        this.gradingId = gradingId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gradingId != null ? gradingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grading)) {
            return false;
        }
        Grading other = (Grading) object;
        if ((this.gradingId == null && other.gradingId != null) || (this.gradingId != null && !this.gradingId.equals(other.gradingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.comicstore.ejb.Grading[ gradingId=" + gradingId + " ]";
    }

}
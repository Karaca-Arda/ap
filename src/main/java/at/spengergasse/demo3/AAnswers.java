package at.spengergasse.demo3;

import jakarta.persistence.*;

@Entity
@Table(name = "a_answers", schema = "quiz", catalog = "")
public class AAnswers {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "a_id")
    private int aId;
    @Basic
    @Column(name = "a_correct")
    private Boolean aCorrect;
    @Basic
    @Column(name = "a_text")
    private String text;
    @Basic
    @Column(name = "a_question_id")
    private Integer aQuestionId;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public Boolean getaCorrect() {
        return aCorrect;
    }

    public void setaCorrect(Boolean aCorrect) {
        this.aCorrect = aCorrect;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getaQuestionId() {
        return aQuestionId;
    }

    public void setaQuestionId(Integer aQuestionId) {
        this.aQuestionId = aQuestionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AAnswers aAnswers = (AAnswers) o;

        if (aId != aAnswers.aId) return false;
        if (aCorrect != null ? !aCorrect.equals(aAnswers.aCorrect) : aAnswers.aCorrect != null) return false;
        if (text != null ? !text.equals(aAnswers.text) : aAnswers.text != null) return false;
        if (aQuestionId != null ? !aQuestionId.equals(aAnswers.aQuestionId) : aAnswers.aQuestionId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aId;
        result = 31 * result + (aCorrect != null ? aCorrect.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (aQuestionId != null ? aQuestionId.hashCode() : 0);
        return result;
    }
}

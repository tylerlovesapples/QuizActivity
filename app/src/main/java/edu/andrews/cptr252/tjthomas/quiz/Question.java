package edu.andrews.cptr252.tjthomas.quiz;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Markus Oh on 4/3/2017.
 */

public class Question {
    /** Unique ID for each question */
    private UUID mId;
    /** Question */
    private String mQuestion;
    /** Up to 4 answers */
    private Question[] mQuestions;
    /** When did it last-edit? */
    private Date mDate;
    /** has the question been checked? */
    private boolean mChecked;

    public Question(){
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public Question[] getQuestions() {
        return mQuestions;
    }

    public void setQuestions(Question[] questions) {
        mQuestions = questions;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isChecked() {
        return mChecked;
    }

    public void setChecked(boolean checked) {
        mChecked = checked;
    }
}

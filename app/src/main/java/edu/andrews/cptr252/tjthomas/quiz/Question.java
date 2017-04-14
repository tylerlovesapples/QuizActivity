package edu.andrews.cptr252.tjthomas.quiz;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Markus Oh and Tyler Thomas on 4/3/2017.
 */

public class Question {
    /** Unique ID for each question */
    private UUID mId;
    /** Question */
    private String mQuestion;
    /** Infinite amount of answers */
    private LinkedList<String> mAnswers;
    /** which answer in mAnswers is a correct one? */
    private LinkedList<Integer> mCorrect;
    /** how many answers are in mAnswers? */
    private int mSize;
    /** When did it last-edit? */
    private Date mDate;
    /** has the question been checked? */
    private boolean mChecked;

    public Question(){
        mAnswers = new LinkedList<String>();
        mCorrect = new LinkedList<Integer>();
        mId = UUID.randomUUID();
    }

    /**
     * A method that adds an answer into the List. This method also tracks
     * if the answer is correct or not.
     * @param answer    answer to be added
     * @param isCorrect is answer correct one or just another choice?
     */
    public void addAnswer(String answer, boolean isCorrect){
        mAnswers.addLast(answer);
        mSize++;
        if(isCorrect != false){
            mCorrect.addLast(mSize - 1);
        }
    }

    /**
     * Remove the answer according to the position.
     */
    public void removePosition(int pos){
        mAnswers.removePosition(pos);
        mSize--;
        //have to remove the incorrect answers in mCorrect list if the removed item is correct answer.
        //have to decrement all the items in mCorrect list.
        //if there is only one item that is about to be removed, then ask user if he/she wants
        // to delete the whole question.
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

    @Override
    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append(mQuestion + " ");
        for(int i = 0; i < mSize; i++){
            result.append(mAnswers.get(i) + " ");
        }
        return result.toString();
    }
}

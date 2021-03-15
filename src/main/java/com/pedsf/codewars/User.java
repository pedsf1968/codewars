package com.pedsf.codewars;

public class User {
    Integer ID;
    String firstName;
    String lastName;
    int rank;
    int progress;

    User() {
        this.rank = -8;
        this.progress = 0;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public void incProgress(int progress) {

        setProgress(this.progress + progress);

        if(getProgress()>100) {
            setProgress(getProgress()-100);
            if(getRank()==-1) {
                setRank(1);
            } else if (getRank()<8) {
                setRank(this.rank+1);
            }
        }

    }

}

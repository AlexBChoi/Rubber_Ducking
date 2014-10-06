package com.peardice.android.rubberducking;

//Hold left and right direction duck

import android.media.Image;

public class Duck {
    private Image mLeftFace;
    private Image mRightFace;

    //mabye constrctor?
    //get reference to images
    //how to set image without using src in xml but in code

    public Image getLeftFace() {
        return mLeftFace;
    }

    public void setLeftFace(Image leftFace) {
        mLeftFace = leftFace;
    }

    public Image getRightFace() {
        return mRightFace;
    }

    public void setRightFace(Image rightFace) {
        mRightFace = rightFace;
    }
}
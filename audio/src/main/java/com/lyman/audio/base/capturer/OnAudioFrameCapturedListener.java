package com.lyman.audio.base.capturer;

/**
 * Author: lyman
 * Email: lymenye@gmail.com
 * Date: 2017/11/6
 * Description:
 */

public interface OnAudioFrameCapturedListener {
    void onAudioFrameCaptured(byte[] audioData);
}

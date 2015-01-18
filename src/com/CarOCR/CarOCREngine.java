package com.CarOCR;

public class CarOCREngine {
	public native void init();
	public native void release();
	public native int loadDiction(byte[] gDic,int lenDic);
	native int recogpageFile(String filepath,char[] result);
	native int recogpageFileSpeed(String filepath,char[] result);
	static {
        System.loadLibrary("carRecog");
    }
}

package com.leanplum;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.leanplum.internal.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class LeanplumInflater {
    private Context context;
    private LeanplumResources res;

    private LeanplumInflater(Context context) {
        this.context = context;
    }

    public static LeanplumInflater from(Context context) {
        return new LeanplumInflater(context);
    }

    public LeanplumResources getLeanplumResources() {
        return getLeanplumResources(null);
    }

    public LeanplumResources getLeanplumResources(Resources resources) {
        LeanplumResources leanplumResources = this.res;
        if (leanplumResources != null) {
            return leanplumResources;
        }
        if (resources == null) {
            resources = this.context.getResources();
        }
        if (resources instanceof LeanplumResources) {
            return (LeanplumResources) resources;
        }
        LeanplumResources leanplumResources2 = new LeanplumResources(resources);
        this.res = leanplumResources2;
        return leanplumResources2;
    }

    public View inflate(int i) {
        return inflate(i, null, false);
    }

    public View inflate(int i, ViewGroup viewGroup) {
        return inflate(i, viewGroup, viewGroup != null);
    }

    public View inflate(int i, ViewGroup viewGroup, boolean z) throws IOException {
        InputStream inputStreamStream;
        Throwable th;
        XmlResourceParser xmlResourceParser;
        Throwable th2;
        try {
            Var overrideResource = getLeanplumResources(this.context.getResources()).getOverrideResource(i);
            if (overrideResource == null || overrideResource.stringValue.equals(overrideResource.defaultValue())) {
                return LayoutInflater.from(this.context).inflate(i, viewGroup, z);
            }
            int iOverrideResId = overrideResource.overrideResId();
            if (iOverrideResId != 0) {
                return LayoutInflater.from(this.context).inflate(iOverrideResId, viewGroup, z);
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                inputStreamStream = overrideResource.stream();
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i2 = inputStreamStream.read(bArr);
                        if (i2 <= -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                    Object objNewInstance = Class.forName("android.content.res.XmlBlock").getConstructor(byte[].class).newInstance(byteArrayOutputStream.toByteArray());
                    try {
                        xmlResourceParser = (XmlResourceParser) objNewInstance.getClass().getMethod("newParser", null).invoke(objNewInstance, null);
                    } catch (Throwable th3) {
                        xmlResourceParser = null;
                        th2 = th3;
                    }
                    try {
                        View viewInflate = LayoutInflater.from(this.context).inflate(xmlResourceParser, viewGroup, z);
                        try {
                            inputStreamStream.close();
                            return viewInflate;
                        } catch (IOException unused) {
                            Log.e("Failed to close input stream.", new Object[0]);
                            return viewInflate;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            throw new RuntimeException(th2);
                        } finally {
                            if (xmlResourceParser != null) {
                                xmlResourceParser.close();
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        Log.e("Could not inflate resource " + i + ":" + overrideResource.stringValue(), th);
                        if (inputStreamStream != null) {
                            try {
                                inputStreamStream.close();
                            } catch (IOException unused2) {
                                Log.e("Failed to close input stream.", new Object[0]);
                            }
                        }
                        return LayoutInflater.from(this.context).inflate(i, viewGroup, z);
                    } catch (Throwable th6) {
                        if (inputStreamStream != null) {
                            try {
                                inputStreamStream.close();
                            } catch (IOException unused3) {
                                Log.e("Failed to close input stream.", new Object[0]);
                            }
                        }
                        throw th6;
                    }
                }
            } catch (Throwable th7) {
                inputStreamStream = null;
                th = th7;
            }
        } catch (Throwable th8) {
            if (!(th8 instanceof InflateException)) {
                Log.exception(th8);
            }
            return LayoutInflater.from(this.context).inflate(i, viewGroup, z);
        }
    }
}

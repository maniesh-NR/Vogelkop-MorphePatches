package com.google.ads.interactivemedia.v3.impl.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zzay {
    private static final /* synthetic */ zzay[] $VALUES;
    public static final zzay Html;
    public static final zzay IFrame;
    public static final zzay Static;

    static {
        zzay zzayVar = new zzay("Html", 0);
        Html = zzayVar;
        zzay zzayVar2 = new zzay("Static", 1);
        Static = zzayVar2;
        zzay zzayVar3 = new zzay("IFrame", 2);
        IFrame = zzayVar3;
        $VALUES = new zzay[]{zzayVar, zzayVar2, zzayVar3};
    }

    public static zzay valueOf(String str) {
        return (zzay) Enum.valueOf(zzay.class, str);
    }

    public static zzay[] values() {
        return (zzay[]) $VALUES.clone();
    }
}

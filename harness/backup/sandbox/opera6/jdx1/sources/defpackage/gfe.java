package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gfe {
    public static final gfe a;
    public static final gfe b;
    public static final gfe c;
    public static final /* synthetic */ gfe[] d;

    static {
        gfe gfeVar = new gfe("Default", 0);
        a = gfeVar;
        gfe gfeVar2 = new gfe("UserInput", 1);
        b = gfeVar2;
        gfe gfeVar3 = new gfe("PreventUserInput", 2);
        c = gfeVar3;
        d = new gfe[]{gfeVar, gfeVar2, gfeVar3};
    }

    public static gfe valueOf(String str) {
        return (gfe) Enum.valueOf(gfe.class, str);
    }

    public static gfe[] values() {
        return (gfe[]) d.clone();
    }
}

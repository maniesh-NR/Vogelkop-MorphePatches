package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.leanplum.messagetemplates.MessageTemplateConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public class frj {
    public static final drj d;
    public static final frj e;
    public static final frj f;
    public static final erj g;
    public static final /* synthetic */ frj[] h;
    public static final /* synthetic */ h58 i;
    public final String a;
    public final int b;
    public final byte c;

    static {
        frj frjVar = new frj("EMAIL", 0, 2132021570, 2, "android.intent.action.SENDTO");
        e = frjVar;
        frj frjVar2 = new frj("PHONE", 1, 2132021569, 4, "android.intent.action.DIAL");
        f = frjVar2;
        erj erjVar = new erj(MessageTemplateConstants.Args.URL, 2, 2132021571, 1, "android.intent.action.VIEW");
        g = erjVar;
        frj[] frjVarArr = {frjVar, frjVar2, erjVar};
        h = frjVarArr;
        i = new h58(frjVarArr);
        d = new drj((byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public frj(String str, int i2, int i3, int i4, String str2) {
        this.a = str2;
        this.b = i3;
        this.c = i4;
    }

    public static frj valueOf(String str) {
        return (frj) Enum.valueOf(frj.class, str);
    }

    public static frj[] values() {
        return (frj[]) h.clone();
    }

    public Intent d(Context context, Uri uri) {
        return new Intent(this.a).setData(uri);
    }
}

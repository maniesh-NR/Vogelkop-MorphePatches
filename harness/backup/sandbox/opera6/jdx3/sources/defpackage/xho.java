package defpackage;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class xho {
    public File A;
    public final String B;
    public String C;
    public String D;
    public boolean E;
    public long F;
    public eyi G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public boolean V;
    public final String W;
    public final String X;
    public final int Y;
    public int Z;
    public w06 a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public final String m;
    public String n;
    public ArrayList o;
    public ArrayList p;
    public String q;
    public String r;
    public String s;
    public HashMap t;
    public String u;
    public String v;
    public String w;
    public ArrayList x;
    public String y;
    public ArrayList z;

    public xho(w06 w06Var, String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        this.a = w06Var;
        this.b = str;
        this.c = str2;
        if (w06Var == w06.i) {
            this.l = str3;
        } else if (w06Var == w06.u) {
            this.m = str3;
            dgo dgoVar = new dgo(this, (byte) 1);
            h9o h9oVar = new h9o((byte) 22);
            if (!TextUtils.isEmpty(str3) && URLUtil.isNetworkUrl(str3)) {
                gxo.c.b(new h4m((Object) str3, (Object) h9oVar, (Object) dgoVar, (byte) 13));
            }
        }
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = str6;
    }

    public xho(w06 w06Var, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, int i) {
        this.a = w06Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
        this.B = str6;
        this.W = str7;
        this.X = str8;
        this.Y = i;
    }

    public final boolean a() {
        if (TextUtils.isEmpty(this.s)) {
            return false;
        }
        File file = this.A;
        if (file == null) {
            file = new File(this.s);
            this.A = file;
        }
        return file.exists() && this.A.length() == this.F;
    }
}

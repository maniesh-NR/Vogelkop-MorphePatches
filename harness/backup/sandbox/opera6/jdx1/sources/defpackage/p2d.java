package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class p2d {
    public final ir5 a;
    public final HashSet b;
    public HashMap c;
    public HashMap d;
    public HashMap e;
    public fxj f;
    public j1d g;
    public ArrayList h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public int m;

    public p2d() {
        ir5 ir5Var = new ir5();
        new t72(0);
        this.a = ir5Var;
        this.b = new HashSet();
        this.m = 0;
    }

    public final void a(String str) {
        izc.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.k - this.j) / this.l) * 1000.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(((t1c) obj).a("\t"));
        }
        return sb.toString();
    }
}

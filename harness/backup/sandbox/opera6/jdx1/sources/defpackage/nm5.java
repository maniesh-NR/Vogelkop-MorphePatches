package defpackage;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nm5 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final int a;
    public final int b;
    public final ssa c;
    public final PendingIntent d;
    public final o3j e;
    public final cig f;
    public final cig g;
    public final Bundle h;
    public final Bundle i;
    public final ijg j;
    public final h1b k;
    public final h1b l;
    public final MediaSession.Token m;
    public final csh n;

    static {
        String str = tym.a;
        o = "0";
        p = "1";
        q = "2";
        r = "9";
        s = "e";
        t = "d";
        u = "3";
        v = "4";
        w = "5";
        x = "6";
        y = "b";
        z = "7";
        A = "8";
        B = "a";
        C = "c";
    }

    public nm5(int i, int i2, ssa ssaVar, PendingIntent pendingIntent, h1b h1bVar, h1b h1bVar2, csh cshVar, o3j o3jVar, cig cigVar, cig cigVar2, Bundle bundle, Bundle bundle2, ijg ijgVar, MediaSession.Token token) {
        this.a = i;
        this.b = i2;
        this.c = ssaVar;
        this.d = pendingIntent;
        this.k = h1bVar;
        this.l = h1bVar2;
        this.n = cshVar;
        this.e = o3jVar;
        this.f = cigVar;
        this.g = cigVar2;
        this.h = bundle;
        this.i = bundle2;
        this.j = ijgVar;
        this.m = token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [ssa] */
    public static nm5 a(Bundle bundle) {
        csh cshVarG;
        csh cshVarG2;
        csh cshVarG3;
        psa psaVar;
        IBinder binder = bundle.getBinder(B);
        if (binder instanceof mm5) {
            return ((mm5) binder).a;
        }
        int i = bundle.getInt(o, 0);
        int i2 = bundle.getInt(A, 0);
        IBinder binder2 = bundle.getBinder(p);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(r);
        if (parcelableArrayList != null) {
            z0b z0bVarP = h1b.p();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                bundle2.getClass();
                z0bVarP.c(vb5.g(i2, bundle2));
            }
            cshVarG = z0bVarP.g();
        } else {
            a1b a1bVar = h1b.b;
            cshVarG = csh.e;
        }
        csh cshVar = cshVarG;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(s);
        if (parcelableArrayList2 != null) {
            z0b z0bVarP2 = h1b.p();
            for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i4);
                bundle3.getClass();
                z0bVarP2.c(vb5.g(i2, bundle3));
            }
            cshVarG2 = z0bVarP2.g();
        } else {
            a1b a1bVar2 = h1b.b;
            cshVarG2 = csh.e;
        }
        csh cshVar2 = cshVarG2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(t);
        if (parcelableArrayList3 != null) {
            z0b z0bVarP3 = h1b.p();
            for (int i5 = 0; i5 < parcelableArrayList3.size(); i5++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i5);
                bundle4.getClass();
                z0bVarP3.c(vb5.g(i2, bundle4));
            }
            cshVarG3 = z0bVarP3.g();
        } else {
            a1b a1bVar3 = h1b.b;
            cshVarG3 = csh.e;
        }
        csh cshVar3 = cshVarG3;
        Bundle bundle5 = bundle.getBundle(u);
        o3j o3jVarA = bundle5 == null ? o3j.b : o3j.a(bundle5);
        Bundle bundle6 = bundle.getBundle(w);
        cig cigVarB = bundle6 == null ? cig.b : cig.b(bundle6);
        Bundle bundle7 = bundle.getBundle(v);
        cig cigVarB2 = bundle7 == null ? cig.b : cig.b(bundle7);
        Bundle bundle8 = bundle.getBundle(x);
        Bundle bundle9 = bundle.getBundle(y);
        Bundle bundle10 = bundle.getBundle(z);
        ijg ijgVarP = bundle10 == null ? ijg.H : ijg.p(i2, bundle10);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(C);
        Bundle bundle11 = bundle9;
        int i6 = xqd.g;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ssa)) {
            psa psaVar2 = new psa();
            psaVar2.a = iBinder;
            psaVar = psaVar2;
        } else {
            psaVar = (ssa) iInterfaceQueryLocalInterface;
        }
        if (bundle8 == null) {
            bundle8 = Bundle.EMPTY;
        }
        Bundle bundle12 = bundle8;
        if (bundle11 == null) {
            bundle11 = Bundle.EMPTY;
        }
        return new nm5(i, i2, psaVar, pendingIntent, cshVar, cshVar2, cshVar3, o3jVarA, cigVarB2, cigVarB, bundle12, bundle11, ijgVarP, token);
    }

    public final Bundle b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(o, this.a);
        bundle.putBinder(p, this.c.asBinder());
        bundle.putParcelable(q, this.d);
        h1b h1bVar = this.k;
        boolean zIsEmpty = h1bVar.isEmpty();
        String str = r;
        if (!zIsEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(h1bVar.size());
            int size = h1bVar.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = h1bVar.get(i2);
                i2++;
                arrayList.add(((vb5) obj).l());
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        h1b h1bVar2 = this.l;
        if (!h1bVar2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(h1bVar2.size());
                int size2 = h1bVar2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = h1bVar2.get(i3);
                    i3++;
                    arrayList2.add(((vb5) obj2).l());
                }
                bundle.putParcelableArrayList(s, arrayList2);
            } else {
                csh cshVarH = vb5.h(h1bVar2, true, true);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(cshVarH.d);
                a1b a1bVarU = cshVarH.u(0);
                while (a1bVarU.hasNext()) {
                    arrayList3.add(((vb5) a1bVarU.next()).l());
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        csh cshVar = this.n;
        if (!cshVar.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(cshVar.d);
            a1b a1bVarU2 = cshVar.u(0);
            while (a1bVarU2.hasNext()) {
                arrayList4.add(((vb5) a1bVarU2.next()).l());
            }
            bundle.putParcelableArrayList(t, arrayList4);
        }
        o3j o3jVar = this.e;
        o3jVar.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        omm ommVarN = o3jVar.a.n();
        while (ommVarN.hasNext()) {
            arrayList5.add(((n3j) ommVarN.next()).b());
        }
        bundle2.putParcelableArrayList(o3j.c, arrayList5);
        bundle.putBundle(u, bundle2);
        String str2 = v;
        cig cigVar = this.f;
        bundle.putBundle(str2, cigVar.c());
        String str3 = w;
        cig cigVar2 = this.g;
        bundle.putBundle(str3, cigVar2.c());
        bundle.putBundle(x, this.h);
        bundle.putBundle(y, this.i);
        bundle.putBundle(z, this.j.o(z5i.V(cigVar, cigVar2), false, false).r(i));
        bundle.putInt(A, this.b);
        MediaSession.Token token = this.m;
        if (token != null) {
            bundle.putParcelable(C, token);
        }
        return bundle;
    }
}

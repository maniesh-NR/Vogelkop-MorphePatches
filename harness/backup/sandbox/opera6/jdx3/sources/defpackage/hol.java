package defpackage;

import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hol {
    public final fol a;
    public final bwg b;
    public final zyk c;
    public final zyk d;
    public final zyk e;

    public hol(fol folVar, bwg bwgVar) {
        this.a = folVar;
        this.b = bwgVar;
        final byte b = 0;
        this.c = z4c.b(new Function0(this) { // from class: gol
            public final /* synthetic */ hol b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                hol holVar = this.b;
                switch (b2) {
                    case 0:
                        return Uri.parse(holVar.a.a);
                    case 1:
                        zyk zykVar = holVar.c;
                        String path = ((Uri) zykVar.getValue()).getPath();
                        return Boolean.valueOf(path == null || path.length() == 0 || Intrinsics.a(((Uri) zykVar.getValue()).getPath(), "/"));
                    default:
                        return Boolean.valueOf(wqm.w(holVar.a.a));
                }
            }
        });
        final byte b2 = 1;
        this.d = z4c.b(new Function0(this) { // from class: gol
            public final /* synthetic */ hol b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                hol holVar = this.b;
                switch (b22) {
                    case 0:
                        return Uri.parse(holVar.a.a);
                    case 1:
                        zyk zykVar = holVar.c;
                        String path = ((Uri) zykVar.getValue()).getPath();
                        return Boolean.valueOf(path == null || path.length() == 0 || Intrinsics.a(((Uri) zykVar.getValue()).getPath(), "/"));
                    default:
                        return Boolean.valueOf(wqm.w(holVar.a.a));
                }
            }
        });
        final byte b3 = 2;
        this.e = z4c.b(new Function0(this) { // from class: gol
            public final /* synthetic */ hol b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                hol holVar = this.b;
                switch (b22) {
                    case 0:
                        return Uri.parse(holVar.a.a);
                    case 1:
                        zyk zykVar = holVar.c;
                        String path = ((Uri) zykVar.getValue()).getPath();
                        return Boolean.valueOf(path == null || path.length() == 0 || Intrinsics.a(((Uri) zykVar.getValue()).getPath(), "/"));
                    default:
                        return Boolean.valueOf(wqm.w(holVar.a.a));
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hol)) {
            return false;
        }
        hol holVar = (hol) obj;
        return this.a.equals(holVar.a) && this.b.equals(holVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}

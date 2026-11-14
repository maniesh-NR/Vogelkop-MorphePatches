package defpackage;

import android.graphics.drawable.ColorDrawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qv3 implements w7l {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qv3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void c(int i, b8l b8lVar) {
    }

    @Override // defpackage.w7l
    public final void a(int i, dyg dygVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((yt3) obj).run(dygVar instanceof s7l ? ((s7l) dygVar).b : null);
                break;
            case 1:
                e8l e8lVar = (e8l) obj;
                if (!(dygVar instanceof s7l)) {
                    if (!dygVar.equals(r7l.b)) {
                        h9o.p();
                        break;
                    } else {
                        e8lVar.d = false;
                        qlk qlkVar = e8lVar.f;
                        if (!e8lVar.a()) {
                            e8lVar.b();
                            break;
                        } else {
                            vml.a(qlkVar);
                            vml.d(qlkVar, 500L);
                            break;
                        }
                    }
                } else {
                    e8lVar.c.r(h8l.c);
                    break;
                }
            default:
                kol kolVar = (kol) obj;
                hol holVar = kolVar.e;
                if (holVar.a.c == i) {
                    if (!kolVar.g || !(dygVar instanceof s7l)) {
                        if (!(dygVar instanceof s7l)) {
                            bwg bwgVar = holVar.b;
                            if ((bwgVar instanceof col) && !((col) bwgVar).a) {
                                kolVar.h();
                                break;
                            }
                        }
                    } else {
                        ColorDrawable colorDrawable = kol.r;
                        kolVar.i(xvg.s(kolVar.a, ((s7l) dygVar).b, kolVar.a()), new znl(eol.a));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.w7l
    public final void b(int i, b8l b8lVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                e8l e8lVar = (e8l) obj;
                e8lVar.d = false;
                if (!Intrinsics.a(b8lVar, y7l.a) && !Intrinsics.a(b8lVar, z7l.a)) {
                    if (!(b8lVar instanceof a8l)) {
                        h9o.p();
                        break;
                    } else {
                        e8lVar.b();
                        break;
                    }
                } else {
                    e8lVar.b();
                    break;
                }
            default:
                kol kolVar = (kol) obj;
                hol holVar = kolVar.e;
                if (holVar.a.c == i) {
                    bwg bwgVar = holVar.b;
                    if (!(b8lVar instanceof a8l)) {
                        if ((bwgVar instanceof col) && !((col) bwgVar).a) {
                            kolVar.h();
                            break;
                        }
                    } else if (!(bwgVar instanceof znl)) {
                        kolVar.h();
                        break;
                    } else {
                        if (kolVar.g) {
                            ColorDrawable colorDrawable = kol.r;
                            int iOrdinal = ((znl) bwgVar).a.ordinal();
                            if (iOrdinal != 0 && iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    h9o.p();
                                    break;
                                }
                            }
                        }
                        kolVar.e(new thk((byte) 19));
                        break;
                    }
                }
                break;
        }
    }
}

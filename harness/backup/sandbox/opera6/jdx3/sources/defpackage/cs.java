package defpackage;

import android.util.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cs extends gyg {
    public final /* synthetic */ byte l;

    public /* synthetic */ cs(byte b) {
        this.l = b;
    }

    public final boolean i(Object obj, Object obj2) {
        switch (this.l) {
            case 0:
                return Intrinsics.a((js) obj, (js) obj2);
            case 1:
                return true;
            case 2:
                return Intrinsics.a((w3g) obj, (w3g) obj2);
            case 3:
                return Intrinsics.a((String) obj, (String) obj2);
            case 4:
                return true;
            case 5:
                return ((Pair) obj).equals((Pair) obj2);
            case 6:
                return Intrinsics.a((l6j) obj, (l6j) obj2);
            case 7:
                return ((wol) obj) == ((wol) obj2);
            default:
                return Intrinsics.a((e7o) obj, (e7o) obj2);
        }
    }

    public final boolean j(Object obj, Object obj2) {
        switch (this.l) {
            case 0:
                js jsVar = (js) obj;
                js jsVar2 = (js) obj2;
                if (!(jsVar instanceof is) || !(jsVar2 instanceof is)) {
                    if (jsVar.b != jsVar2.b) {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                w3g w3gVar = (w3g) obj;
                w3g w3gVar2 = (w3g) obj2;
                if (!Intrinsics.a(w3gVar.g, w3gVar2.g) || !Intrinsics.a(w3gVar.b, w3gVar2.b) || !Intrinsics.a(w3gVar.f, w3gVar2.f)) {
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                if (((l6j) obj).a != ((l6j) obj2).a) {
                    break;
                }
                break;
            case 7:
                if (((wol) obj) != ((wol) obj2)) {
                    break;
                }
                break;
            default:
                e7o e7oVar = (e7o) obj2;
                if (((e7o) obj) == null || e7oVar == null || r5.a.b != e7oVar.a.b) {
                    break;
                }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object x(Object obj, Object obj2) {
        switch (this.l) {
            case 0:
                return Unit.a;
            default:
                return super.x(obj, obj2);
        }
    }
}

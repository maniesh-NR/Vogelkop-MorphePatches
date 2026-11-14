package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class js8 extends k1g {
    public final /* synthetic */ byte i;
    public final Object j;
    public final Object k;

    public /* synthetic */ js8(Object obj, Object obj2, byte b) {
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    public js8(s9i s9iVar, ArrayList arrayList) {
        this.i = (byte) 0;
        this.j = arrayList;
        this.k = s9iVar;
    }

    public final int C() {
        byte b = this.i;
        Object obj = this.k;
        switch (b) {
            case 0:
                return ((ArrayList) this.j).size();
            case 1:
                return ((d5g) obj).k;
            default:
                return ((ArrayList) obj).size();
        }
    }

    public final int D() {
        byte b = this.i;
        Object obj = this.j;
        switch (b) {
            case 0:
                return ((ArrayList) ((s9i) this.k).d).size();
            case 1:
                return ((d5g) obj).k;
            default:
                return ((ArrayList) obj).size();
        }
    }

    public final boolean h(int i, int i2) {
        byte b = this.i;
        Object obj = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                if (((gyj) ((ArrayList) ((s9i) obj).d).get(i)).a == ((gyj) ((ArrayList) obj2).get(i2)).a) {
                    break;
                }
                break;
            case 1:
                d5g d5gVar = (d5g) obj2;
                boolean z = i == d5gVar.h;
                d5g d5gVar2 = (d5g) obj;
                boolean z2 = i2 == d5gVar2.h;
                if (!z || !z2) {
                    boolean z3 = i == d5gVar.i;
                    boolean z4 = i2 == d5gVar2.i;
                    if (!z3 || !z4) {
                        boolean z5 = i == d5gVar.j;
                        boolean z6 = i2 == d5gVar2.j;
                        if (!z5) {
                            if (!z6) {
                                break;
                            }
                        } else if (!z6) {
                        }
                    }
                } else if (d5gVar.d != d5gVar2.d || d5gVar.e != d5gVar2.e || d5gVar.f != d5gVar2.f || d5gVar.g != d5gVar2.g || d5gVar.b != d5gVar2.b) {
                }
                break;
        }
        return true;
    }

    public final boolean i(int i, int i2) {
        byte b = this.i;
        Object obj = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                return h(i, i2);
            case 1:
                d5g d5gVar = (d5g) obj2;
                boolean z = i == d5gVar.h;
                d5g d5gVar2 = (d5g) obj;
                boolean z2 = i2 == d5gVar2.h;
                if (z) {
                    if (!z2) {
                        return false;
                    }
                } else {
                    if (z2) {
                        return false;
                    }
                    boolean z3 = i == d5gVar.i;
                    boolean z4 = i2 == d5gVar2.i;
                    if (z3) {
                        if (!z4) {
                            return false;
                        }
                    } else {
                        if (z4) {
                            return false;
                        }
                        boolean z5 = i == d5gVar.j;
                        boolean z6 = i2 == d5gVar2.j;
                        if (z5) {
                            if (!z6) {
                                return false;
                            }
                        } else {
                            if (z6) {
                                return false;
                            }
                            w3g w3gVarA = d5gVar.a(i);
                            w3g w3gVarA2 = d5gVar2.a(i2);
                            if (!Intrinsics.a(w3gVarA.g, w3gVarA2.g) || !Intrinsics.a(w3gVarA.b, w3gVarA2.b) || !Intrinsics.a(w3gVarA.f, w3gVarA2.f)) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            default:
                return Intrinsics.a(((ldo) ((ArrayList) obj2).get(i)).a, ((ldo) ((ArrayList) obj).get(i2)).a);
        }
    }
}

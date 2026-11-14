package defpackage;

import com.opera.api.Callback;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class q59 implements f7f, hh4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final Object c;
    public Object d;

    public q59(ekc ekcVar, Callback callback) {
        this.a = (byte) 2;
        this.c = ekcVar;
        this.d = callback;
        ekcVar.k(this);
    }

    public /* synthetic */ q59(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = true;
    }

    public q59(wsc wscVar, ysc yscVar) {
        this.a = (byte) 1;
        this.b = false;
        this.c = wscVar;
        this.d = yscVar;
    }

    public q59(ydn ydnVar, slk slkVar, gmk gmkVar) {
        this.a = (byte) 4;
        this.c = ydnVar;
        slkVar.i.k(this);
        gmkVar.a.k(new qzg(this, (byte) 23));
    }

    public boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.hh4
    public final void cancel() {
        this.b = true;
        ((ekc) this.c).p(this);
    }

    public final void d0(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                List list = (List) this.d;
                f7f f7fVar = (f7f) obj2;
                if (!this.b) {
                    f7fVar.d0(obj);
                    break;
                } else {
                    List list2 = list;
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((p59) it.next()).a();
                    }
                    f7fVar.d0(obj);
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((p59) it2.next()).b(obj);
                    }
                    this.b = false;
                    break;
                }
            case 1:
                wsc wscVar = (wsc) obj2;
                if (ctc.c(2)) {
                    Objects.toString(wscVar);
                    wscVar.dataToString(obj);
                }
                this.b = true;
                ((ysc) this.d).onLoadFinished(wscVar, obj);
                break;
            case 2:
                if (a(obj)) {
                    ((ekc) obj2).p(this);
                    if (!this.b) {
                        ((Callback) this.d).run(obj);
                        break;
                    }
                }
                break;
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                if (this.b && fFloatValue == 1.0f) {
                    this.b = false;
                    ((o9k) obj2).f0((d0n) this.d, true);
                    break;
                }
                break;
            default:
                wvg wvgVar = (wvg) obj;
                if (wvgVar.e != 0) {
                    ck8 ck8Var = wvgVar.g;
                    ydn ydnVar = (ydn) obj2;
                    if (ck8Var != null) {
                        ydnVar.K(ck8Var.c, ck8Var.d, ck8Var.a, ck8Var.b);
                        this.b = true;
                    } else {
                        ydnVar.K(0L, 0L, "", "");
                        this.b = false;
                    }
                    ydn ydnVar2 = (ydn) obj2;
                    Boolean bool = (Boolean) this.d;
                    if (bool != null) {
                        if (!bool.booleanValue()) {
                            ydnVar2.E(false);
                            break;
                        } else if (this.b) {
                            ydnVar2.E(true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return ((ysc) this.d).toString();
            default:
                return super.toString();
        }
    }
}

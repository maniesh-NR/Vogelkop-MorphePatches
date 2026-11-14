package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.print.PageRange;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.opera.android.browser.SafeBrowsingBridge;
import com.opera.android.sheet.OperaBottomSheetBehavior;
import com.opera.android.widget.MeasurableHeightScrollView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class r9g implements ekj, m94, k37, fkj, n5o, vlk, OnSuccessListener, OnCompleteListener, m9n, vwh, urg, ceb, dwa {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r9g(ijc ijcVar, xrh xrhVar) {
        this.a = (byte) 22;
        this.b = ijcVar;
    }

    public /* synthetic */ r9g(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.k37
    public final void a(mkg[] mkgVarArr) {
        ojg ojgVar = (ojg) this.b;
        ojgVar.b = mkgVarArr;
        ojgVar.c = true;
        ArrayDeque arrayDeque = ojgVar.d.s;
        while (!arrayDeque.isEmpty()) {
            ojg ojgVar2 = (ojg) arrayDeque.getFirst();
            if (!ojgVar2.c) {
                return;
            }
            ojgVar2.a.a(ojgVar2.b);
            arrayDeque.removeFirst();
        }
    }

    public final Object attachCompleter(l94 l94Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                xf2 xf2Var = (xf2) obj;
                na2.B((a64) xf2Var.g, (CoroutineContext) null, (rx5) null, new fb9(xf2Var, l94Var, null, (byte) 18), 3);
                return "FetchData for PipeCameraPresence0";
            default:
                moh mohVar = (moh) obj;
                f28 f28Var = mohVar.s;
                s6h s6hVar = new s6h(mohVar, l94Var);
                b2j b2jVar = mohVar.d;
                synchronized (f28Var.a) {
                    f28Var.s = s6hVar;
                    f28Var.t = b2jVar;
                }
                return "videoEncodingFuture";
        }
    }

    @Override // defpackage.ekj
    public final void b(hjm hjmVar) {
        tn tnVar = (tn) this.b;
        if (tnVar.a) {
            return;
        }
        ((bag) tnVar.d).s();
    }

    @Override // defpackage.ceb
    public final void c(MotionEvent motionEvent) {
        vzk vzkVar = (vzk) this.b;
        if (motionEvent.getAction() == 0) {
            ((nii) vzkVar.c).a();
        }
    }

    public final void d() {
        pni pniVar = (pni) this.b;
        synchronized (pniVar.b) {
            pniVar.c();
        }
    }

    @Override // defpackage.fkj
    public final void e(gkj gkjVar, hjm hjmVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                ((HashSet) ((ga6) obj).b).remove(gkjVar);
                break;
            default:
                ((yvg) obj).h = null;
                break;
        }
    }

    @Override // defpackage.vwh
    public final void f(o93 o93Var) {
        ((iii) this.b).R(o93Var);
    }

    public final Object g(Object obj) {
        ArrayList arrayList;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                ((hu5) obj2).run((List) obj);
                return null;
            case 15:
                ((s2g) obj2).run((Long) obj);
                return null;
            case 16:
                glh glhVar = (glh) obj2;
                Long l = (Long) obj;
                if (l != null) {
                    h7f h7fVar = glhVar.b;
                    g7f g7fVarH = am2.h(h7fVar, h7fVar);
                    while (g7fVarH.hasNext()) {
                        ((clh) g7fVarH.next()).b(l.longValue());
                    }
                } else {
                    glhVar.getClass();
                }
                return null;
            case 17:
                ((vuh) obj2).run((Long) obj);
                return null;
            case 19:
                ((qe9) obj2).run((Uri) obj);
                return null;
            default:
                String str = (String) obj;
                tu tuVar = (tu) ((rii) obj2).b;
                if (str != null) {
                    int i = vqi.h;
                    try {
                        arrayList = hn9.n(str).a;
                    } catch (JSONException unused) {
                        arrayList = l08.a;
                    }
                    tuVar.run(arrayList);
                } else {
                    tuVar.run(l08.a);
                }
                return Unit.a;
        }
    }

    public final void h(int i) {
        nlh nlhVar = (nlh) this.b;
        nlhVar.C = i;
        ((SharedPreferences) nlhVar.B.get()).edit().putInt("sort_order", fki.j(i)).apply();
        blh blhVar = nlhVar.F;
        xvj xvjVar = blhVar.e;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < xvjVar.h; i2++) {
            arrayList.add((wkh) xvjVar.f(i2));
        }
        blhVar.g.b = i;
        xvjVar.d();
        xvjVar.c(arrayList);
    }

    @Override // defpackage.vlk
    public final void i(amk amkVar) {
        int i;
        boolean z;
        tn tnVar = (tn) this.b;
        if (tnVar.a) {
            i = 2132022225;
            z = true;
        } else {
            i = amkVar.c.a != null ? 2132022212 : 2132022224;
            z = false;
        }
        TextView textView = (TextView) ((or2) tnVar.b).b;
        phj.u0(textView, n1h.d(textView.getContext().getString(i), z ? new owj[]{new owj("<terms>", "</terms>", new jng(3, textView.getContext(), null)), new owj("<bold>", "</bold>", new StyleSpan(1))} : new owj[]{new owj("<terms>", "</terms>", new jng(3, textView.getContext(), null))}));
        ((Button) tnVar.c).setText(tnVar.a ? 2132021683 : amkVar.c.a != null ? 2132021632 : 2132021652);
    }

    @Override // defpackage.m9n
    public final void j() {
        knh knhVar = (knh) this.b;
        y83 y83Var = knhVar.A;
        if (y83Var == null) {
            y83Var = null;
        }
        OperaBottomSheetBehavior operaBottomSheetBehaviorC = OperaBottomSheetBehavior.C((MeasurableHeightScrollView) y83Var.g);
        if (operaBottomSheetBehaviorC.q != 6) {
            return;
        }
        vl6 vl6Var = knhVar.B;
        vl6 vl6Var2 = vl6Var != null ? vl6Var : null;
        int i = operaBottomSheetBehaviorC.f ? -1 : operaBottomSheetBehaviorC.e;
        OperaBottomSheetBehavior operaBottomSheetBehavior = (OperaBottomSheetBehavior) vl6Var2.b;
        operaBottomSheetBehavior.H(i);
        operaBottomSheetBehavior.I(4);
        ((NestedScrollView) vl6Var2.e).scrollTo(0, 0);
    }

    public final void k(dgh dghVar) {
        ycc yccVar;
        PreviewView previewView = (PreviewView) this.b;
        int i = PreviewView.p;
        if (!(dghVar instanceof gdo) || (yccVar = previewView.h) == null) {
            return;
        }
        float f = ((gdo) dghVar).a;
        if (yccVar.j() && yccVar.t) {
            xug.i();
            odo odoVar = (odo) yccVar.w.g();
            if (odoVar != null) {
                yccVar.n(Math.min(Math.max(odoVar.a() * (f > 1.0f ? v0g.g(f, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f) * 2.0f)), odoVar.b), odoVar.c));
            }
        }
    }

    public final void onComplete(Task task) {
        Task task2;
        Task task3;
        byte b = this.a;
        z1i z1iVar = null;
        Object obj = this.b;
        switch (b) {
            case 14:
                sjh sjhVar = (sjh) obj;
                long jUptimeMillis = SystemClock.uptimeMillis();
                sjhVar.p = jUptimeMillis;
                long j = jUptimeMillis - sjhVar.o;
                if (!task.isSuccessful()) {
                    Object exception = task.getException();
                    boolean z = exception instanceof y1i;
                    x1i x1iVar = w1i.b;
                    if (z) {
                        int iD = ((y1i) exception).d();
                        if (iD == -100) {
                            x1iVar = s1i.b;
                        } else if (iD == -2) {
                            x1iVar = t1i.b;
                        } else if (iD == -1) {
                            x1iVar = u1i.b;
                        }
                    }
                    ((x5f) sjhVar.d).R(11, x1iVar.a);
                }
                if (j <= 1000) {
                    Task task4 = sjhVar.n;
                    if (task4 != null && task4.isComplete() && (task2 = sjhVar.n) != null && task2.isSuccessful() && (task3 = sjhVar.n) != null) {
                        z1iVar = (z1i) task3.getResult();
                    }
                    sjhVar.b(z1iVar);
                    break;
                }
                break;
            default:
                vgi vgiVar = (vgi) obj;
                x5f x5fVar = vgiVar.d;
                if (SafeBrowsingBridge.a != vgiVar) {
                    vgiVar.S();
                    break;
                } else {
                    ArrayDeque arrayDeque = SafeBrowsingBridge.b;
                    SafeBrowsingBridge.b = null;
                    if (task.isSuccessful()) {
                        vgiVar.g = false;
                        x5fVar.G0(vd0.b);
                    } else {
                        vgiVar.g = true;
                        x5fVar.G0(vd0.d);
                    }
                    if (arrayDeque != null) {
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            wgi wgiVar = (wgi) it.next();
                            SafeBrowsingBridge.checkUrl(wgiVar.a, wgiVar.b);
                        }
                        break;
                    }
                }
                break;
        }
    }

    public final void onSuccess(Object obj) {
        ((veh) this.b).invoke(obj);
    }

    @Override // defpackage.urg
    public final boolean test(Object obj) {
        PageRange[] pageRangeArr = (PageRange[]) this.b;
        PageRange[] pageRangeArr2 = (PageRange[]) obj;
        if (pageRangeArr.length == 1 && pageRangeArr[0].getStart() == 0 && pageRangeArr[0].getEnd() == Integer.MAX_VALUE) {
            int length = pageRangeArr2.length;
            int i = 0;
            int end = 0;
            while (true) {
                if (i < length) {
                    PageRange pageRange = pageRangeArr2[i];
                    if (pageRange.getStart() != end) {
                        break;
                    }
                    end = pageRange.getEnd() + 1;
                    i++;
                } else {
                    if ((pageRangeArr2.length == 0 ? 0 : pageRangeArr2[pageRangeArr2.length - 1].getEnd()) < 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

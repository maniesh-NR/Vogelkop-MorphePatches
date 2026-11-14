package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.undo.UndoBar;
import com.opera.hype.image.editor.EditImage;
import com.opera.hype.image.editor.TextBoxFrame;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import okhttp3.internal.cache.DiskLruCache;

/* loaded from: classes.dex */
public final /* synthetic */ class cv2 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cv2(h07 h07Var, cd5 cd5Var, qjl qjlVar) {
        this.a = (byte) 22;
        this.b = h07Var;
        this.c = cd5Var;
    }

    public /* synthetic */ cv2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ cv2(y11 y11Var, fk7 fk7Var, fsf fsfVar) {
        this.a = (byte) 25;
        this.b = y11Var;
        this.c = fsfVar;
    }

    public final Object invoke(Object obj) throws Throwable {
        Throwable th;
        Object q0iVar;
        vz3 vz3Var;
        UndoBar undoBar;
        byte b = this.a;
        int i = 0;
        Throwable th2 = null;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((TextView) ((or2) ((or2) obj3).e).f).setText(((Boolean) obj).booleanValue() ? ((ev2) obj2).v.e : "********");
                return Unit.a;
            case 1:
                bw2 bw2Var = (bw2) obj3;
                cw2 cw2Var = (cw2) obj2;
                inl inlVar = bw2Var.o;
                if (inlVar != null) {
                    inlVar.b();
                }
                bw2Var.o = null;
                cd5 cd5Var = cw2Var.c;
                if (cd5Var != null) {
                    cd5Var.j0(Unit.a);
                }
                cw2Var.c = null;
                return Unit.a;
            case 2:
                mz2 mz2Var = (mz2) obj3;
                qf5 qf5Var = (qf5) obj2;
                xje xjeVar = mz2Var.a;
                if (xjeVar != null) {
                    xje.a(xjeVar, qf5Var.b);
                } else {
                    kcf kcfVar = mz2Var.b;
                    if (kcfVar == null) {
                        qp2.n("Unreachable");
                        return null;
                    }
                    kcfVar.b(qf5Var.a);
                }
                return new rz2(mz2Var, qf5Var, (byte) 0);
            case 3:
                na2.B((nx5) obj3, (CoroutineContext) null, (rx5) null, new r3((qg9) obj, (ztl) obj2, (mt5) null, (byte) 7), 3);
                return Unit.a;
            case 4:
                p1d.p((p1d) obj, (ifg) obj3, ((ki3) obj2).o, 4);
                return Unit.a;
            case 5:
                dj3 dj3Var = (dj3) obj2;
                osk oskVar = (osk) obj;
                esg esgVar = ((mi3) obj3).b;
                try {
                    ((nb2) esgVar.b).Q(oskVar, dj3Var);
                } catch (SQLException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        throw e;
                    }
                    if (!StringsKt.E(message, "unique", true) && !StringsKt.E(message, "2067", false) && !StringsKt.E(message, "1555", false)) {
                        throw e;
                    }
                    ((li3) esgVar.c).X(oskVar, dj3Var);
                }
                return Unit.a;
            case 6:
                lj3 lj3Var = (lj3) obj3;
                String str = (String) obj2;
                pzh pzhVar = (pzh) obj;
                if (pzhVar.q) {
                    InputStream inputStreamByteStream = pzhVar.g.byteStream();
                    try {
                        p0i p0iVar = t0i.b;
                        Throwable t0iVar = new t0i(lj3.b(inputStreamByteStream, str, (File) lj3Var.c.get()));
                        if (inputStreamByteStream != null) {
                            try {
                                inputStreamByteStream.close();
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        }
                        Throwable th4 = th2;
                        th2 = t0iVar;
                        th = th4;
                    } catch (Throwable th5) {
                        th = th5;
                        if (inputStreamByteStream != null) {
                            try {
                                inputStreamByteStream.close();
                            } catch (Throwable th6) {
                                wf8.a(th, th6);
                            }
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    q0iVar = ((t0i) th2).a;
                } else {
                    p0i p0iVar2 = t0i.b;
                    q0iVar = new q0i(new IOException(sko.i(pzhVar.d, "Request failed with error code: ")));
                }
                return new t0i(q0iVar);
            case 7:
                o3c o3cVar = (o3c) obj;
                o3cVar.a();
                mk7.m0(o3cVar, (d91) obj3, (nvj) obj2, 0.0f, (nk7) null, 60);
                return Unit.a;
            case 8:
                o3c o3cVar2 = (o3c) obj;
                o3cVar2.a();
                mk7.m0(o3cVar2, ((ltf) obj3).k, (nvj) obj2, 0.0f, (nk7) null, 60);
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((dfe) ((wth) obj3).b).k((jq5) obj2);
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                String str2 = (String) obj3;
                xy3 xy3Var = (xy3) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    xy3Var.k(c62.x);
                } else if (str2 != null) {
                    xy3Var.k(new a62(str2));
                }
                return Unit.a;
            case 11:
                bp3 bp3Var = (bp3) obj3;
                f9 f9Var = (f9) obj2;
                int iOrdinal = ((rjf) obj).ordinal();
                if (iOrdinal == 0) {
                    vz3Var = vz3.a;
                } else if (iOrdinal == 1) {
                    vz3Var = vz3.b;
                } else if (iOrdinal == 2) {
                    vz3Var = vz3.c;
                } else if (iOrdinal == 3) {
                    vz3Var = null;
                } else if (iOrdinal == 4) {
                    vz3Var = vz3.d;
                } else {
                    if (iOrdinal != 5) {
                        h9o.p();
                        return null;
                    }
                    vz3Var = vz3.e;
                }
                if (vz3Var != null) {
                    bp3Var.i = null;
                    f9Var.invoke(vz3Var);
                }
                return Unit.a;
            case 12:
                View view = (View) obj3;
                bp3 bp3Var2 = (bp3) obj2;
                rjf rjfVar = (rjf) obj;
                if (rjfVar != rjf.d) {
                    if (rjfVar != rjf.c) {
                        bp3Var2.b = false;
                    }
                    return Unit.a;
                }
                view.performClick();
                ((c9l) bp3Var2.d).b.p.postOnAnimationDelayed(new fv2(bp3Var2, (byte) 23), 1000L);
                return Unit.a;
            case 13:
                d5o d5oVar = (d5o) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                z37 z37Var = (z37) obj;
                d5oVar.b = z37Var;
                d5oVar.c = null;
                int size = arrayList.size();
                while (i < size) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    ((Function1) obj4).invoke(z37Var);
                }
                return Unit.a;
            case 14:
                dl4 dl4Var = (dl4) obj3;
                String str3 = (String) obj2;
                if (((tq2) obj) == tq2.a && (undoBar = dl4Var.l) != null) {
                    undoBar.c(Collections.singletonList(str3));
                }
                return Unit.a;
            case 15:
                c61 c61Var = (c61) obj2;
                int iIntValue = ((Integer) obj).intValue();
                rf1 rf1Var = (rf1) CollectionsKt.firstOrNull(((sf1) obj3).b(iIntValue, iIntValue, MessageTemplateConstants.Args.URL));
                if (rf1Var != null) {
                    c61Var.c((String) rf1Var.a);
                }
                return Unit.a;
            case 16:
                Function1 function1 = (Function1) obj2;
                y8f y8fVar = (y8f) obj;
                njl njlVar = (njl) ((afe) obj3).getValue();
                if (njlVar != null) {
                    function1.invoke(Integer.valueOf(njlVar.b.g(y8fVar.a)));
                }
                return Unit.a;
            case 17:
                rn9 rn9Var = (rn9) obj3;
                ((k24) rn9Var.c).j0((xg5) obj2);
                return new ci(rn9Var, (byte) 6);
            case SizeUtil.textSize0_1 /* 18 */:
                qt5 qt5Var = (qt5) obj3;
                ((s2) qt5Var.d).invoke(((or2) obj2).c, ((List) qt5Var.e).get(((Integer) obj).intValue()));
                return Unit.a;
            case 19:
                gbc gbcVar = (gbc) obj3;
                dz3 dz3Var = (dz3) obj2;
                o3c o3cVar3 = (o3c) obj;
                o3cVar3.a();
                if (((Boolean) gbcVar.s.getValue()).booleanValue() || ((Boolean) gbcVar.t.getValue()).booleanValue()) {
                    mk7.E0(o3cVar3, dz3Var, 0L, 0L, 0.0f, (nk7) null, 126);
                }
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                h07 h07Var = (h07) obj3;
                cd5 cd5Var2 = (bd5) obj2;
                Throwable th7 = (Throwable) obj;
                if (th7 == null) {
                    cd5Var2.j0(h07Var.m());
                } else if (th7 instanceof CancellationException) {
                    cd5Var2.k((CancellationException) th7);
                } else {
                    cd5Var2.B0(th7);
                }
                return Unit.a;
            case 21:
                l94 l94Var = (l94) obj3;
                cd5 cd5Var3 = (cd5) obj2;
                Throwable th8 = (Throwable) obj;
                if (th8 == null) {
                    l94Var.b(cd5Var3.R());
                } else if (th8 instanceof CancellationException) {
                    l94Var.c();
                } else {
                    l94Var.d(th8);
                }
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                h07 h07Var2 = (h07) obj3;
                cd5 cd5Var4 = (cd5) obj2;
                Throwable th9 = (Throwable) obj;
                if (th9 == null) {
                    cd5Var4.j0(Unit.a);
                } else if (th9 instanceof CancellationException) {
                    cd5Var4.k((CancellationException) th9);
                } else {
                    cd5Var4.B0(th9);
                }
                return Unit.a;
            case 23:
                mg6 mg6Var = (mg6) obj2;
                rr1 rr1Var = ((ggb) obj).h;
                String str4 = ((c2h) obj3).a;
                vlb vlbVar = vlb.a;
                return new df6(new sd9(sgb.c0(new w2e(rr1Var, str4, new gbb((byte) 13), (byte) 2)), mg6Var.b.b(), (byte) 0), mg6Var, (byte) 3);
            case SizeUtil.textSize2 /* 24 */:
                return DiskLruCache.Editor.a((DiskLruCache) obj3, (DiskLruCache.Editor) obj2, (IOException) obj);
            case 25:
                y11 y11Var = (y11) obj3;
                fsf fsfVar = (fsf) obj2;
                long jF = y8f.f(((yi7) obj).a, 1.0f);
                dk7 dk7Var = ek7.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fsfVar == fsf.a ? jF & 4294967295L : jF >> 32));
                switch (y11Var.a) {
                    case 0:
                        a21 a21Var = (a21) y11Var.b;
                        w11.a((w11) a21Var.m, a21Var.i(fIntBitsToFloat));
                        break;
                    default:
                        ((qn6) y11Var.b).a.invoke(Float.valueOf(fIntBitsToFloat));
                        break;
                }
                return Unit.a;
            case 26:
                xtb[] xtbVarArr = EditImage.s;
                ((oel) obj3).h(((bfl) obj2).f);
                return Unit.a;
            case 27:
                EditImage editImage = (EditImage) obj3;
                Canvas canvas = (Canvas) obj2;
                kk7 kk7Var = editImage.f;
                lxl lxlVar = editImage.h;
                kk7Var.b = (i97) obj;
                at7 at7Var = editImage.i;
                if (at7Var == at7.b) {
                    Path path = lxlVar.c;
                    o8g o8gVar = editImage.n;
                    Paint paintF = o8gVar.c.f(kk7Var);
                    fz2 fz2Var = o8gVar.b;
                    xtb xtbVar = o8g.d[0];
                    paintF.setColor(((Number) fz2Var.b).intValue());
                    canvas.drawPath(path, paintF);
                } else if (at7Var == at7.e) {
                    Path path2 = lxlVar.c;
                    i76 i76Var = editImage.q;
                    Paint paintF2 = i76Var.c.f(kk7Var);
                    fz2 fz2Var2 = i76Var.b;
                    xtb xtbVar2 = i76.d[0];
                    paintF2.setColor(((Number) fz2Var2.b).intValue());
                    canvas.drawPath(path2, paintF2);
                }
                return Unit.a;
            case 28:
                TextBoxFrame textBoxFrame = ((ht7) obj2).a.e;
                float scaleX = (textBoxFrame.getScaleX() * (-textBoxFrame.getWidth())) / 2.0f;
                float scaleY = (textBoxFrame.getScaleY() * (-textBoxFrame.getHeight())) / 2.0f;
                float scaleX2 = ((textBoxFrame.getScaleX() - 1.0f) * textBoxFrame.getWidth()) / 2.0f;
                float scaleY2 = ((textBoxFrame.getScaleY() - 1.0f) * textBoxFrame.getHeight()) / 2.0f;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textBoxFrame.getLayoutParams();
                ((PointF) obj3).set(((i97) obj).b(((textBoxFrame.getTranslationX() + marginLayoutParams.leftMargin) - scaleX) - scaleX2, ((textBoxFrame.getTranslationY() + marginLayoutParams.topMargin) - scaleY) - scaleY2));
                return Unit.a;
            default:
                i1 i1Var = (i1) obj2;
                int i2 = i1Var.b;
                String str5 = (String) i1Var.d;
                String str6 = (String) i1Var.e;
                qbe.v((Context) obj, i2, str6, str5, new su(obj3, (Object) str5, (Object) str6, (byte) 21));
                return Unit.a;
        }
    }
}

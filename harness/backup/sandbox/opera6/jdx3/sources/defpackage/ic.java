package defpackage;

import J.N;
import android.R;
import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.TrackSelectionView;
import androidx.mediarouter.app.e;
import androidx.mediarouter.app.f;
import androidx.mediarouter.app.g;
import androidx.recyclerview.widget.i;
import com.leanplum.internal.Constants;
import com.opera.ad.mraid.MRAIDView;
import com.opera.android.bar.FindInPage;
import com.opera.android.sync.SyncedSessionTab;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class ic implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ic(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ic(wtm wtmVar) {
        this.a = (byte) 17;
        Objects.requireNonNull(wtmVar);
        this.b = wtmVar;
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [android.app.Dialog, tq3] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        gtj gtjVar;
        byte b = this.a;
        z = false;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((se) obj).a();
                return;
            case 1:
                zy0 zy0Var = (zy0) obj;
                if (view == zy0Var.k && (message3 = zy0Var.m) != null) {
                    ptdVarObtain = Message.obtain(message3);
                } else if (view == zy0Var.o && (message2 = zy0Var.q) != null) {
                    ptdVarObtain = Message.obtain(message2);
                } else if (view == zy0Var.s && (message = zy0Var.u) != null) {
                    ptdVarObtain = Message.obtain(message);
                }
                if (ptdVarObtain != null) {
                    ptdVarObtain.sendToTarget();
                }
                zy0Var.J.obtainMessage(1, zy0Var.b).sendToTarget();
                return;
            case 2:
                pj2 pj2Var = (pj2) obj;
                pj2Var.G0(true);
                vzk vzkVar = new vzk(new ole(pj2Var));
                String str = pj2Var.w;
                String string = pj2Var.s.getText().toString();
                String string2 = pj2Var.t.getText().toString();
                String str2 = pj2Var.x;
                tvh tvhVar = new tvh();
                tvhVar.a = dgh.h().buildUpon().appendEncodedPath(vep.h(9)).build().toString();
                lyf lyfVar = new lyf("token", str);
                ArrayList arrayList = tvhVar.c;
                arrayList.add(lyfVar);
                arrayList.add(new lyf("fullname", string));
                arrayList.add(new lyf(Constants.Params.EMAIL, string2));
                vzkVar.a0(tvhVar, str2);
                return;
            case 3:
                ?? r12 = (tq3) obj;
                if (r12.k && r12.isShowing()) {
                    if (!r12.m) {
                        TypedArray typedArrayObtainStyledAttributes = r12.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        r12.l = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        r12.m = true;
                    }
                    if (r12.l) {
                        r12.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ar8) obj).o0();
                return;
            case 5:
                FindInPage findInPage = (FindInPage) obj;
                int id = view.getId();
                if (id == 2131362962) {
                    findInPage.f();
                    return;
                }
                if (id == 2131362970) {
                    findInPage.g = false;
                    zg zgVar = findInPage.d;
                    String str3 = (String) zgVar.c;
                    zgVar.c = str3;
                    zgVar.a = N.MaMXv1PI((WebContents) zgVar.b, str3, false, true);
                    return;
                }
                if (id == 2131362969) {
                    findInPage.g = false;
                    zg zgVar2 = findInPage.d;
                    String str4 = (String) zgVar2.c;
                    zgVar2.c = str4;
                    zgVar2.a = N.MaMXv1PI((WebContents) zgVar2.b, str4, true, true);
                    return;
                }
                return;
            case 6:
                if (view.getAlpha() == 1.0f) {
                    ((View.OnClickListener) obj).onClick(view);
                    return;
                }
                return;
            case 7:
                ((MRAIDView) obj).close();
                return;
            case 8:
                ldd lddVar = (ldd) obj;
                int i = lddVar.e;
                if (i == 2) {
                    lddVar.i0(1);
                } else if (i == 1) {
                    lddVar.i0(2);
                }
                lddVar.j0(lddVar.getView());
                return;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                g gVar = (g) obj;
                boolean zX = gVar.X(((e) gVar).b);
                boolean z2 = !zX;
                boolean zE = ((e) gVar).b.e();
                nnd nndVar = gVar.o;
                if (zX) {
                    dod dodVar = nndVar.j.g;
                    cod codVar = ((e) gVar).b;
                    dodVar.getClass();
                    if (codVar == null) {
                        t3p.q("route must not be null");
                        return;
                    }
                    dod.b();
                    ez9 ez9VarC = dod.c();
                    ynd yndVarA = ez9VarC.d.a();
                    if (yndVarA != null) {
                        qnd qndVar = (qnd) yndVarA.x.get(codVar.c);
                        if (qndVar == null || !qndVar.c || !Collections.unmodifiableList(((cod) yndVarA).v).contains(codVar)) {
                            codVar.toString();
                        } else if (Collections.unmodifiableList(((cod) yndVarA).v).size() > 1) {
                            if (yndVarA.g()) {
                                rnd rndVar = ez9VarC.e;
                                if (!(rndVar instanceof rnd)) {
                                    qp2.n("There is no currently selected dynamic group route.");
                                    return;
                                }
                                rndVar.n(codVar.b);
                            } else if (yndVarA.n()) {
                                ez9VarC.f();
                                yndVarA.toString();
                            } else {
                                yndVarA.toString();
                            }
                        }
                    }
                } else {
                    dod dodVar2 = nndVar.j.g;
                    cod codVar2 = ((e) gVar).b;
                    dodVar2.getClass();
                    if (codVar2 == null) {
                        t3p.q("route must not be null");
                        return;
                    }
                    dod.b();
                    ez9 ez9VarC2 = dod.c();
                    ynd yndVarA2 = ez9VarC2.d.a();
                    if (yndVarA2 != null) {
                        if (!yndVarA2.o(codVar2) || Collections.unmodifiableList(((cod) yndVarA2).v).contains(codVar2)) {
                            codVar2.toString();
                        } else if (yndVarA2.g()) {
                            rnd rndVar2 = ez9VarC2.e;
                            if (!(rndVar2 instanceof rnd)) {
                                qp2.n("There is no currently selected dynamic group route.");
                                return;
                            }
                            rndVar2.m(codVar2.b);
                        } else if (yndVarA2.n()) {
                            ez9VarC2.f();
                            yndVarA2.toString();
                        } else {
                            yndVarA2.toString();
                        }
                    }
                }
                gVar.Y(z2, !zE);
                if (zE) {
                    List listUnmodifiableList = Collections.unmodifiableList(nndVar.j.j.v);
                    for (cod codVar3 : Collections.unmodifiableList(((e) gVar).b.v)) {
                        if (listUnmodifiableList.contains(codVar3) != z2) {
                            g gVar2 = (e) nndVar.j.w.get(codVar3.c);
                            if (gVar2 instanceof g) {
                                gVar2.Y(z2, true);
                            }
                        }
                    }
                }
                ond ondVar = nndVar.j;
                cod codVar4 = ((e) gVar).b;
                List listUnmodifiableList2 = Collections.unmodifiableList(ondVar.j.v);
                int iMax = Math.max(1, listUnmodifiableList2.size());
                if (codVar4.e()) {
                    Iterator it = Collections.unmodifiableList(codVar4.v).iterator();
                    while (it.hasNext()) {
                        if (listUnmodifiableList2.contains((cod) it.next()) != z2) {
                            iMax += !zX ? 1 : -1;
                        }
                    }
                } else {
                    iMax += zX ? -1 : 1;
                }
                boolean z3 = ondVar.T && Collections.unmodifiableList(ondVar.j.v).size() > 1;
                boolean z4 = ondVar.T && iMax >= 2;
                if (z3 != z4) {
                    f fVarM = ondVar.t.M(0);
                    if (fVarM instanceof f) {
                        f fVar = fVarM;
                        nndVar.G(z4 ? fVar.g : 0, ((i) fVar).itemView);
                        return;
                    }
                    return;
                }
                return;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                vyk vykVar = ((uyk) obj).e;
                vykVar.getClass();
                SyncedSessionTab syncedSessionTab = (SyncedSessionTab) view.getTag(2131364644);
                String str5 = syncedSessionTab.d;
                if (TextUtils.isEmpty(str5)) {
                    str5 = syncedSessionTab.c;
                }
                vx3 vx3VarA = ay3.a(str5, lqm.h, false);
                vx3VarA.b = 3;
                vx3VarA.c = 1;
                ac8.a(new ay3(vx3VarA));
                vykVar.g0();
                return;
            case 11:
                sjh.q = true;
                Toast.makeText(((lel) obj).d.getContext(), "Load a page or block an ad to show Rate Us", 1).show();
                return;
            case 12:
                qsl qslVar = ((Toolbar) obj).L;
                ptdVarObtain = qslVar != null ? qslVar.b : null;
                if (ptdVarObtain != null) {
                    ptdVarObtain.collapseActionView();
                    return;
                }
                return;
            case 13:
                ((ltl) obj).l0(false);
                return;
            case 14:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                int i2 = TrackSelectionView.e;
                CheckedTextView checkedTextView = trackSelectionView.b;
                HashMap map = trackSelectionView.c;
                CheckedTextView checkedTextView2 = trackSelectionView.a;
                if (view == checkedTextView2) {
                    trackSelectionView.d = true;
                    map.clear();
                } else {
                    if (view != checkedTextView) {
                        trackSelectionView.d = false;
                        view.getTag().getClass();
                        throw new ClassCastException();
                    }
                    trackSelectionView.d = false;
                    map.clear();
                }
                checkedTextView2.setChecked(trackSelectionView.d);
                if (!trackSelectionView.d && map.isEmpty()) {
                    z = true;
                }
                checkedTextView.setChecked(z);
                throw null;
            case 15:
                zhj.a(new vyl(), 4099).c(((wyl) obj).getContext());
                return;
            case 16:
                ami amiVar = (ami) obj;
                if (((mgh) amiVar.d) == null || (gtjVar = (gtj) amiVar.c) == null) {
                    return;
                }
                ((na3) gtjVar.a).k = 2500;
                gtjVar.j();
                ((na3) ((gtj) amiVar.c).a).k = 5000;
                mgh mghVar = (mgh) amiVar.d;
                UndoBar undoBar = (UndoBar) mghVar.c;
                mhk mhkVar = (mhk) mghVar.b;
                mkm mkmVarE = mhkVar.e();
                if (mkmVarE != null) {
                    e5d e5dVar = mkmVarE.a;
                    if (undoBar.f) {
                        for (mkm mkmVarE2 = mhkVar.e(); mkmVarE2 != null; mkmVarE2 = mhkVar.e()) {
                            e5d e5dVar2 = mkmVarE2.a;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList2.addAll((ArrayList) e5dVar.c);
                            arrayList2.addAll((ArrayList) e5dVar2.c);
                            arrayList3.addAll((List) e5dVar.b);
                            arrayList3.addAll((List) e5dVar2.b);
                            e5dVar = new e5d(arrayList2, arrayList3, (byte) 2);
                        }
                    }
                    undoBar.g = true;
                    ((UndoBar) mghVar.c).e.t(e5dVar);
                    undoBar.g = false;
                    undoBar.f();
                }
                LinkedList linkedList = (LinkedList) mhkVar.c;
                int size = linkedList.size();
                mkm mkmVar = size > 0 ? (mkm) linkedList.get(size - 1) : null;
                if (mkmVar != null) {
                    undoBar.b(mkmVar);
                    return;
                }
                ami amiVar2 = undoBar.b;
                gtj gtjVar2 = (gtj) amiVar2.c;
                if (gtjVar2 != null) {
                    gtjVar2.a();
                    amiVar2.c = null;
                    return;
                }
                return;
            default:
                wtm wtmVar = (wtm) obj;
                View view2 = (View) wtmVar.c;
                if (view2 != null) {
                    ((Activity) wtmVar.a).runOnUiThread(new vr9(wtmVar, view2, (byte) 29));
                    return;
                }
                return;
        }
    }
}

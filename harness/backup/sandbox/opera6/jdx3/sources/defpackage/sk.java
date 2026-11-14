package defpackage;

import J.N;
import android.app.ActivityManager;
import android.content.DialogInterface;
import androidx.fragment.app.r;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.chromium.OperaBrowserContextHandle;
import com.opera.android.browser.passwordmanager.ChooseCredentialsDialogRequest;
import com.opera.android.history.f;
import com.opera.android.settings.cleardata.StorageFragment;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.content_public.browser.SiteZoomInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class sk implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sk(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        List list;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wk wkVar = (wk) obj;
                xi5 xi5Var = wkVar.y;
                xi5Var.e.d();
                xi5Var.f(0L);
                wkVar.H0();
                break;
            case 1:
                g01 g01Var = (g01) obj;
                OperaBrowserContextHandle operaBrowserContextHandle = (OperaBrowserContextHandle) N.M4QvXpDD();
                double dMNitnPWj = N.MNitnPWj(operaBrowserContextHandle);
                SiteZoomInfo[] siteZoomInfoArr = (SiteZoomInfo[]) N.MZV6nIgn(operaBrowserContextHandle, SiteZoomInfo.class);
                HashMap map = new HashMap();
                for (SiteZoomInfo siteZoomInfo : siteZoomInfoArr) {
                    map.put(siteZoomInfo.a, Double.valueOf(siteZoomInfo.b));
                }
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    N.MvtzH5Ni(operaBrowserContextHandle, (String) it.next(), dMNitnPWj);
                }
                lx3.a(null, true);
                j14.t(false, (yqd) null);
                Iterator it2 = hj.a(3).iterator();
                while (it2.hasNext()) {
                    hj.b(0, 3, (String) it2.next(), false);
                }
                g01Var.w.G();
                N.MgUu3OWK();
                g01Var.v.Q("text_wrap");
                g01Var.getContext().getSharedPreferences("open_in_app_count", 0).edit().clear().apply();
                break;
            case 2:
                d83 d83Var = ((jh3) obj).v;
                if (((a4g) d83Var.b) != null && (list = d83Var.c) != null) {
                    wth wthVar = (wth) d83Var.d;
                    if (wthVar != null) {
                        wthVar.b = null;
                        d83Var.d = null;
                    }
                    int size = list.size();
                    d83Var.c.clear();
                    a4g a4gVar = (a4g) d83Var.b;
                    List list2 = a4gVar.a;
                    while (list2.size() > 0) {
                        int size2 = list2.size() - 1;
                        N.MvKxovNE(a4gVar.b, size2);
                        list2.remove(size2);
                    }
                    d83Var.notifyItemRangeRemoved(0, size);
                    break;
                }
                break;
            case 3:
                m93 m93Var = (m93) obj;
                m93Var.I0();
                m93Var.r.G();
                break;
            case 4:
                k6l k6lVar = ((BrowserActivity) obj).V;
                (k6lVar != null ? k6lVar : null).j();
                break;
            case 5:
                hy4 hy4Var = (hy4) obj;
                if (!hy4Var.c) {
                    hy4Var.c = true;
                    N.M2LTxUAH(((ChooseCredentialsDialogRequest) hy4Var.e).b, i);
                    dialogInterface.dismiss();
                    break;
                }
                break;
            case 6:
                BrowserActivity browserActivity = ((zu3) ((l35) obj).d).a;
                int i2 = BrowserActivity.E1;
                browserActivity.l0(true, null);
                break;
            case 7:
                dm8 dm8Var = (dm8) obj;
                dm8.K0(dm8Var.G0());
                dm8.K0(s9g.h.c.E(kag.DENIED));
                dm8Var.z.G();
                dm8Var.A.G();
                break;
            case 8:
                f fVarL0 = ((dda) obj).L0();
                ((aw0) fVarL0.d.get()).a(new ld9(fVarL0, (byte) 20));
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                xtb[] xtbVarArr = ywa.g;
                ((r) obj).finish();
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                knh knhVar = (knh) obj;
                gnh gnhVar = knhVar.C;
                if (gnhVar == null) {
                    gnhVar = null;
                }
                N.MMBIyHnn(gnhVar.b.f.a);
                gnhVar.i.r(l08.a);
                vl6 vl6Var = knhVar.B;
                (vl6Var != null ? vl6Var : null).S();
                break;
            case 11:
                ((rn9) obj).G(null);
                break;
            case 12:
                ((ActivityManager) ((StorageFragment) obj).getActivity().getSystemService("activity")).clearApplicationUserData();
                break;
            case 13:
                wyl wylVar = (wyl) obj;
                xi5 xi5VarA = xi5.a(wylVar.getContext());
                xi5VarA.f.d();
                xi5VarA.g(0L);
                wylVar.H0();
                break;
            case 14:
                jdo jdoVar = (jdo) obj;
                OperaBrowserContextHandle operaBrowserContextHandle2 = (OperaBrowserContextHandle) N.M4QvXpDD();
                double dMNitnPWj2 = N.MNitnPWj(operaBrowserContextHandle2);
                d83 d83Var2 = jdoVar.v;
                if (d83Var2 == null) {
                    d83Var2 = null;
                }
                ArrayList arrayList = (ArrayList) d83Var2.c;
                ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                int size3 = arrayList.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    arrayList2.add(((ldo) obj2).a);
                }
                int size4 = arrayList2.size();
                int i4 = 0;
                while (i4 < size4) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    jdoVar.G0(operaBrowserContextHandle2, dMNitnPWj2, (String) obj3);
                }
                d83 d83Var3 = jdoVar.v;
                d83 d83Var4 = d83Var3 != null ? d83Var3 : null;
                int size5 = ((ArrayList) d83Var4.d).size();
                ((ArrayList) d83Var4.c).clear();
                ((ArrayList) d83Var4.d).clear();
                ((TreeSet) d83Var4.e).clear();
                UndoBar undoBar = (UndoBar) d83Var4.b;
                mhk mhkVar = (mhk) undoBar.c.b;
                mhkVar.b = 0;
                ((LinkedList) mhkVar.c).clear();
                undoBar.a(false);
                d83Var4.notifyItemRangeRemoved(0, size5);
                jdoVar.r.Q("text_wrap");
                break;
            default:
                ((AtomicInteger) obj).set(i);
                break;
        }
    }
}

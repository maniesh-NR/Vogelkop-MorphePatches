package defpackage;

import J.N;
import android.content.Context;
import android.content.DialogInterface;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import com.opera.android.RootView;
import com.opera.android.browser.chromium.ChromiumContent;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

/* loaded from: classes.dex */
public final class xy0 extends Handler {
    public final /* synthetic */ byte a = 0;
    public WeakReference b;

    public /* synthetic */ xy0() {
    }

    public xy0(Looper looper, tfp tfpVar) {
        super(looper);
        this.b = new WeakReference(tfpVar);
    }

    public xy0(WeakReference weakReference) {
        super(Looper.getMainLooper());
        this.b = weakReference;
    }

    public xy0(srh srhVar) {
        this.b = new WeakReference(srhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws IOException {
        Origin origin;
        View viewFindViewById;
        short s;
        qnd qndVar;
        snd countryCode = null;
        int i = 0;
        switch (this.a) {
            case 0:
                int i2 = message.what;
                if (i2 != -3 && i2 != -2 && i2 != -1) {
                    if (i2 == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        break;
                    }
                } else {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                    break;
                }
                break;
            case 1:
                hq9 hq9Var = (hq9) this.b.get();
                if (hq9Var != null) {
                    xr5 xr5Var = hq9Var.b;
                    int i3 = message.what;
                    qt6 qt6Var = hq9Var.g;
                    gq9 gq9Var = hq9Var.a;
                    int systemUiVisibility = xr5Var.getSystemUiVisibility();
                    h7f h7fVar = xr5Var.c;
                    if (i3 == 1) {
                        hq9 hq9Var2 = (hq9) qt6Var.f;
                        View view = hq9Var2.b;
                        ChromiumContent chromiumContent = (ChromiumContent) qt6Var.c;
                        if (!chromiumContent.h()) {
                            short s2 = !qt6Var.a ? (short) 5126 : (short) 5124;
                            hq9Var2.h = s2;
                            view.setSystemUiVisibility(s2);
                            if (!qt6Var.b) {
                                i18 i18Var = (i18) qt6Var.d;
                                if (!chromiumContent.e().f0()) {
                                    GURL gurlM = chromiumContent.m();
                                    Origin originD = chromiumContent.e().I().d();
                                    if (originD != null) {
                                        String[] strArr = wqm.a;
                                        origin = (Origin) N.MlKpOXRH(gurlM, originD);
                                    } else {
                                        origin = (Origin) N.Me$8dlre(gurlM);
                                    }
                                    String strH = !origin.d ? origin.b : "";
                                    if (strH.length() == 0) {
                                        strH = wqm.H(gurlM.a);
                                    }
                                    boolean z = (chromiumContent.t || ((ydn) ((pw3) i18Var.d.b).get()).d.a()) ? false : true;
                                    l5b l5bVar = q9n.c;
                                    ViewParent parent = view.getParent();
                                    while (true) {
                                        if (parent == 0) {
                                            viewFindViewById = null;
                                        } else if (RootView.class.isAssignableFrom(parent.getClass())) {
                                            viewFindViewById = (View) parent;
                                        } else {
                                            parent = parent.getParent();
                                        }
                                    }
                                    if (viewFindViewById != null) {
                                        viewFindViewById = viewFindViewById.findViewById(2131364492);
                                    }
                                    if (viewFindViewById == null) {
                                        viewFindViewById = view;
                                    }
                                    sxh sxhVar = new sxh(2132021573, new Object[]{strH});
                                    e18 e18Var = new e18(viewFindViewById, sxhVar);
                                    gtj gtjVarD = gtj.d(viewFindViewById, sxhVar, 0, null);
                                    gtjVarD.f(2132019755, new yk4((Object) chromiumContent, (byte) 18));
                                    gtjVarD.a.a(new h18(e18Var, i18Var, z, gurlM));
                                    gtjVarD.b(view);
                                    oml omlVar = new oml(i18Var.a.d(new cn7(i18Var, gtjVarD, (byte) 5)));
                                    ig igVar = new ig((Object) i18Var, (byte) 25);
                                    if (chromiumContent.S) {
                                        e18Var.e = true;
                                        e18Var.b(false);
                                    }
                                    i18Var.f = new f18(chromiumContent, gtjVarD, e18Var, omlVar, igVar);
                                    coh.k(omlVar, (Object) null, i18.h);
                                    c18.a.invoke(chromiumContent.e(), new g18(igVar));
                                    chromiumContent.k(i18Var);
                                }
                            }
                            oml omlVar2 = new oml(hq9Var2.c.d(new ld9(qt6Var, (byte) 8)));
                            qt6Var.e = omlVar2;
                            omlVar2.b(null, 201L, TimeUnit.MILLISECONDS, null);
                        }
                        h7fVar.b(gq9Var);
                        break;
                    } else if (i3 == 2) {
                        h7fVar.c(gq9Var);
                        hq9 hq9Var3 = (hq9) qt6Var.f;
                        hq9Var3.h = (short) 0;
                        hq9Var3.b.setSystemUiVisibility(0);
                        ((i18) qt6Var.d).M();
                        oml omlVar3 = (oml) qt6Var.e;
                        if (omlVar3 != null) {
                            omlVar3.cancel(false);
                            qt6Var.e = null;
                            break;
                        }
                    } else if (i3 == 3 && systemUiVisibility != (s = hq9Var.h)) {
                        hq9Var.h = s;
                        xr5Var.setSystemUiVisibility(s);
                        break;
                    }
                }
                break;
            case 2:
                srh srhVar = (srh) this.b.get();
                if (srhVar != null) {
                    SparseArray sparseArray = srhVar.h;
                    xrh xrhVar = srhVar.i;
                    ArrayList arrayList = xrhVar.k;
                    int i4 = message.what;
                    int i5 = message.arg1;
                    int i6 = message.arg2;
                    Object obj = message.obj;
                    Bundle bundlePeekData = message.peekData();
                    if (i4 == 0) {
                        if (i5 == srhVar.g) {
                            srhVar.g = 0;
                            if (xrhVar.n == srhVar) {
                                xrhVar.k();
                            }
                        }
                        if (((urh) sparseArray.get(i5)) != null) {
                            sparseArray.remove(i5);
                            break;
                        }
                    } else {
                        switch (i4) {
                            case 2:
                                if (obj == null || (obj instanceof Bundle)) {
                                    Bundle bundle = (Bundle) obj;
                                    if (srhVar.f == 0 && i5 == srhVar.g && i6 >= 1) {
                                        srhVar.g = 0;
                                        srhVar.f = i6;
                                        mi9 mi9VarA = mi9.a(bundle);
                                        if (xrhVar.n == srhVar) {
                                            xrhVar.f(mi9VarA);
                                        }
                                        if (xrhVar.n == srhVar) {
                                            xrhVar.o = true;
                                            int size = arrayList.size();
                                            while (i < size) {
                                                ((trh) arrayList.get(i)).a(xrhVar.n);
                                                i++;
                                            }
                                            dnd dndVar = ((und) xrhVar).e;
                                            if (dndVar != null) {
                                                srh srhVar2 = xrhVar.n;
                                                int i7 = srhVar2.d;
                                                srhVar2.d = i7 + 1;
                                                srhVar2.b(10, i7, 0, dndVar.a, (Bundle) null);
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 3:
                                if (obj == null || (obj instanceof Bundle)) {
                                    Bundle bundle2 = (Bundle) obj;
                                    urh urhVar = (urh) sparseArray.get(i5);
                                    if (urhVar != null) {
                                        sparseArray.remove(i5);
                                        urhVar.a(bundle2);
                                        break;
                                    }
                                }
                                break;
                            case 4:
                                if (obj == null || (obj instanceof Bundle)) {
                                    if (bundlePeekData != null) {
                                        bundlePeekData.getString("error");
                                    }
                                    Bundle bundle3 = (Bundle) obj;
                                    if (((urh) sparseArray.get(i5)) != null) {
                                        sparseArray.remove(i5);
                                        Objects.toString(bundle3);
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                if (obj == null || (obj instanceof Bundle)) {
                                    Bundle bundle4 = (Bundle) obj;
                                    if (srhVar.f != 0) {
                                        mi9 mi9VarA2 = mi9.a(bundle4);
                                        if (xrhVar.n == srhVar) {
                                            xrhVar.f(mi9VarA2);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 6:
                                if (obj instanceof Bundle) {
                                    Bundle bundle5 = (Bundle) obj;
                                    urh urhVar2 = (urh) sparseArray.get(i5);
                                    if (urhVar2 != null) {
                                        sparseArray.remove(i5);
                                        if (!bundle5.containsKey("routeId")) {
                                            Objects.toString(bundle5);
                                            break;
                                        } else {
                                            urhVar2.a(bundle5);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 7:
                                if (obj == null || (obj instanceof Bundle)) {
                                    Bundle bundle6 = (Bundle) obj;
                                    if (srhVar.f != 0 && bundle6 != null) {
                                        Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                        bnd bndVar = bundle7 != null ? new bnd((String) null, bundle7, Collections.EMPTY_LIST) : null;
                                        ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                        if (parcelableArrayList != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            int size2 = parcelableArrayList.size();
                                            int i8 = 0;
                                            while (i8 < size2) {
                                                Object obj2 = parcelableArrayList.get(i8);
                                                i8++;
                                                Bundle bundle8 = (Bundle) obj2;
                                                if (bundle8 == null) {
                                                    qndVar = null;
                                                } else {
                                                    Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                                    qndVar = new qnd(bundle9 != null ? new bnd((String) null, bundle9, Collections.EMPTY_LIST) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                                }
                                                arrayList2.add(qndVar);
                                            }
                                            if (xrhVar.n == srhVar) {
                                                int size3 = arrayList.size();
                                                while (true) {
                                                    if (i < size3) {
                                                        Object obj3 = arrayList.get(i);
                                                        i++;
                                                        snd sndVar = (trh) obj3;
                                                        if (sndVar.b() == i6) {
                                                            countryCode = sndVar;
                                                        }
                                                    }
                                                }
                                                if (countryCode instanceof vrh) {
                                                    ((vrh) countryCode).l(bndVar, arrayList2);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            case 8:
                                if (xrhVar.n == srhVar) {
                                    int size4 = arrayList.size();
                                    while (true) {
                                        if (i < size4) {
                                            Object obj4 = arrayList.get(i);
                                            i++;
                                            snd sndVar2 = (trh) obj4;
                                            if (sndVar2.b() == i6) {
                                                countryCode = sndVar2;
                                            }
                                        }
                                    }
                                    r9g r9gVar = xrhVar.p;
                                    if (r9gVar != null && (countryCode instanceof snd)) {
                                        snd sndVar3 = countryCode;
                                        ez9 ez9Var = (ez9) ((ijc) r9gVar.b).d;
                                        if (ez9Var.e == sndVar3) {
                                            ez9Var.l(ez9Var.c(), 2, 3, true);
                                        }
                                    }
                                    if (countryCode != null) {
                                        arrayList.remove(countryCode);
                                        countryCode.c();
                                        xrhVar.l();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }
                break;
            default:
                if (((tfp) this.b.get()) != null) {
                    double[] dArr = (double[]) message.obj;
                    try {
                        List<Address> fromLocation = new Geocoder((Context) phf.a.a, Locale.getDefault()).getFromLocation(dArr[0], dArr[1], 1);
                        if (fromLocation != null && !fromLocation.isEmpty()) {
                            countryCode = fromLocation.get(0).getCountryCode();
                        }
                    } catch (IOException unused) {
                    }
                    if (!TextUtils.isEmpty(countryCode)) {
                        new Handler(Looper.getMainLooper()).post(new et2((String) countryCode, (byte) 7));
                        break;
                    }
                }
                break;
        }
    }
}

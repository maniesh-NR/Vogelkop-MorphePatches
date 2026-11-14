package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.i;
import com.google.android.gms.auth.blockstore.Blockstore;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.CheckBox;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.ui.modelutil.PropertyModel;

/* loaded from: classes.dex */
public final /* synthetic */ class uk6 implements n5o, fjc, dic, gx6, ekj, dkj, av4, vwh, OnSuccessListener, OnFailureListener, xjj, pjk, jr9, m94, bqb {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uk6(d11 d11Var, bsc bscVar, tjd tjdVar, IOException iOException, boolean z) {
        this.a = (byte) 2;
        this.b = tjdVar;
    }

    public /* synthetic */ uk6(d11 d11Var, nj6 nj6Var) {
        this.a = (byte) 1;
        this.b = nj6Var;
    }

    public /* synthetic */ uk6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.av4
    public final void E(CheckBox checkBox) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((AtomicBoolean) ((x77) obj).c).set(checkBox.n);
                break;
            default:
                ((s12) obj).b = checkBox.n;
                break;
        }
    }

    @Override // defpackage.dkj
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                Context context = ((gd6) obj).a;
                String[] strArr = OperaApplication.K;
                ((OperaApplication) context.getApplicationContext()).J().V(0, "enable_suggested_speed_dials_on_start_page");
                break;
            default:
                ((re7) obj).u();
                break;
        }
    }

    public final Object apply(Object obj) {
        return Long.valueOf(((f28) this.b).j(((Long) obj).longValue()));
    }

    public final Object attachCompleter(l94 l94Var) {
        b28 b28Var = (b28) this.b;
        b28Var.d.g.execute(new cn7(b28Var, l94Var, (byte) 11));
        return "fetchData";
    }

    @Override // defpackage.ekj
    public final void b(hjm hjmVar) {
        nv6 nv6VarB = ((ru9) this.b).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("startpage.disable_suggested_sites_dialog_shown", true);
        nv6VarB.w();
    }

    @Override // defpackage.pjk
    public final void c(boolean z) {
        ((rv7) this.b).m.b = z;
    }

    public final void d(PropertyModel propertyModel, View view) {
        d06 d06Var;
        PopupWindow popupWindow;
        shf shfVar;
        int i;
        mgf mgfVar = (mgf) this.b;
        SelectionPopupControllerImpl selectionPopupControllerImpl = (SelectionPopupControllerImpl) mgfVar.b;
        d06 d06Var2 = (d06) mgfVar.c;
        boolean z = SelectionPopupControllerImpl.R;
        d06Var2.getClass();
        CharSequence charSequence = (CharSequence) PropertyModel.f(propertyModel, c09.g, "");
        v5h v5hVar = c09.t;
        Map map = propertyModel.b;
        int iB = map.containsKey(v5hVar) ? propertyModel.b(v5hVar) : 0;
        v5h v5hVar2 = c09.s;
        int iB2 = map.containsKey(v5hVar2) ? propertyModel.b(v5hVar2) : 0;
        v5h v5hVar3 = c09.L;
        int iB3 = map.containsKey(v5hVar3) ? propertyModel.b(v5hVar3) : 262144;
        if (iB3 < 0) {
            qp2.o("Invalid order. Must be >= 0");
            return;
        }
        nzi nziVar = new nzi(iB, iB2, 0, (Drawable) null, 0, charSequence, (Character) null, iB3, 0, (CharSequence) null, (Intent) PropertyModel.f(propertyModel, c09.y, (String) null), true, false);
        if (selectionPopupControllerImpl.D && (shfVar = selectionPopupControllerImpl.J) != null) {
            shfVar.D(selectionPopupControllerImpl.z, selectionPopupControllerImpl.A, (nziVar.f == 16908353 || (i = nziVar.e) == 16908353) ? 105 : i == 2131364198 ? 200 : i == 2131364193 ? 103 : i == 2131364192 ? 101 : (i == 16908322 || i == 16908337) ? 102 : i == 2131364199 ? 104 : 108, selectionPopupControllerImpl.L);
        }
        boolean zContainsKey = map.containsKey(kic.a);
        View.OnClickListener onClickListener = (View.OnClickListener) PropertyModel.f(propertyModel, c09.u, (String) null);
        if (onClickListener == null) {
            selectionPopupControllerImpl.f.a(nziVar, !zContainsKey);
            return;
        }
        onClickListener.onClick(null);
        if (zContainsKey || (d06Var = selectionPopupControllerImpl.H) == null || (popupWindow = (PopupWindow) d06Var.a) == null) {
            return;
        }
        popupWindow.dismiss();
        d06Var.a = null;
    }

    @Override // defpackage.vwh
    public final void f(o93 o93Var) {
        ((if7) this.b).R(o93Var);
    }

    /* JADX WARN: Type inference failed for: r14v25, types: [com.google.android.gms.auth.blockstore.RetrieveBytesRequest$Builder] */
    public final Object g(Object obj) {
        ResolveInfo resolveInfoResolveActivity;
        kg0 kg0Var;
        byte b = this.a;
        boolean z = false;
        ResolveInfo resolveInfoResolveActivity2 = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((f9) obj2).invoke((List) obj);
                break;
            case 3:
                yl6 yl6Var = (yl6) obj2;
                b59 b59Var = yl6Var.c;
                boolean z2 = ((SharedPreferences) b59Var.get()).getBoolean("has_been_default_browser_previously", false);
                Context context = yl6Var.a;
                try {
                    resolveInfoResolveActivity = context.getPackageManager().resolveActivity(sl6.a(), 65536);
                } catch (NullPointerException unused) {
                    resolveInfoResolveActivity = null;
                }
                boolean z3 = resolveInfoResolveActivity != null && resolveInfoResolveActivity.match > 0 && "com.opera.browser.beta".equals(resolveInfoResolveActivity.activityInfo.packageName);
                try {
                    resolveInfoResolveActivity2 = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.opera.com/mobile/operabrowser")), 65536);
                } catch (NullPointerException unused2) {
                }
                if (resolveInfoResolveActivity2 != null && resolveInfoResolveActivity2.match > 0 && "com.opera.browser.beta".equals(resolveInfoResolveActivity2.activityInfo.packageName)) {
                    z = true;
                }
                long j = 0;
                if (!yl6Var.a()) {
                    kg0Var = kg0.f;
                } else if (z3) {
                    if (z) {
                        yl6Var.j();
                        kg0Var = kg0.e;
                    } else {
                        yl6Var.j();
                        kg0Var = kg0.c;
                    }
                } else if (z) {
                    yl6Var.j();
                    kg0Var = kg0.d;
                } else if (z2) {
                    SharedPreferences sharedPreferences = (SharedPreferences) b59Var.get();
                    long jCurrentTimeMillis = ((SharedPreferences) b59Var.get()).getLong("default_browser_removal_time", 0L);
                    if (jCurrentTimeMillis == 0) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                        sharedPreferences.edit().putLong("default_browser_removal_time", jCurrentTimeMillis).apply();
                    }
                    j = jCurrentTimeMillis;
                    kg0Var = kg0.g;
                } else {
                    kg0Var = kg0.b;
                }
                break;
            case 4:
                break;
            case 11:
                ua7 ua7Var = (ua7) obj2;
                Iterator it = ((List) obj).iterator();
                boolean z4 = true;
                while (it.hasNext()) {
                    re7 re7VarD = ((rf7) ua7Var.d).d(((Long) it.next()).longValue());
                    if (re7VarD != null) {
                        re7VarD.z(true);
                        z4 = false;
                    }
                }
                ua7Var.q(z4);
                break;
            case 13:
                a21 a21Var = (a21) obj2;
                Pair pair = (Pair) obj;
                if (pair == null) {
                    a21Var.f();
                    break;
                } else {
                    long jLongValue = ((Long) pair.first).longValue();
                    byte[] bArr = (byte[]) pair.second;
                    Context context2 = (Context) a21Var.a;
                    String[] strArr = OperaApplication.K;
                    ((OperaApplication) context2.getApplicationContext()).n().b((Uri) a21Var.f, (Uri) a21Var.h, (String) a21Var.g, (String) a21Var.i, bArr, jLongValue, new iu2(a21Var, (byte) 28));
                    hu5 hu5Var = (hu5) a21Var.m;
                    if (hu5Var != null) {
                        a21Var.m = null;
                        hu5Var.run(Boolean.TRUE);
                        break;
                    }
                }
                break;
            default:
                s28 s28Var = (s28) obj2;
                File file = (File) obj;
                Blockstore.getClient(((t28) s28Var.h).c.a).retrieveBytes(new Object() { // from class: com.google.android.gms.auth.blockstore.RetrieveBytesRequest$Builder
                    private List zza = new ArrayList();
                    private boolean zzb = false;

                    @NonNull
                    public RetrieveBytesRequest build() {
                        return new RetrieveBytesRequest(this.zza, this.zzb);
                    }

                    @NonNull
                    public RetrieveBytesRequest$Builder setKeys(@NonNull List<String> list) {
                        Preconditions.checkNotNull(list, "Keys cannot be set to null");
                        this.zza = list;
                        return this;
                    }

                    @NonNull
                    public RetrieveBytesRequest$Builder setRetrieveAll(boolean z5) {
                        this.zzb = z5;
                        return this;
                    }
                }.setKeys(Collections.singletonList("com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY")).build()).addOnSuccessListener(new va2(new hu5((Object) s28Var, (Object) file, (byte) 8), (byte) 16)).addOnFailureListener(new va2(new cn7(s28Var, file, (byte) 16), (byte) 17));
                break;
        }
        return null;
    }

    public final csh h(int i, eyl eylVar, int[] iArr) {
        bx6 bx6Var = (bx6) this.b;
        z0b z0bVarP = h1b.p();
        for (int i2 = 0; i2 < eylVar.a; i2++) {
            z0bVarP.c(new yw6(i, eylVar, i2, bx6Var, iArr[i2]));
        }
        return z0bVarP.g();
    }

    @Override // defpackage.xjj
    public final void i(Object obj, i iVar) {
        ((b98) ((pu7) iVar).b.c).b.setOnClickListener(new jf7((ua7) this.b, (mu7) obj, (byte) 5));
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                nj6 nj6Var = (nj6) obj2;
                dkd dkdVar = (e11) obj;
                dkdVar.y += nj6Var.g;
                dkdVar.z += nj6Var.e;
                break;
            case 2:
                dkd dkdVar2 = (e11) obj;
                dkdVar2.getClass();
                dkdVar2.w = ((tjd) obj2).a;
                break;
            case 26:
                ((eig) obj).E((y36) obj2);
                break;
            case 27:
                ((eig) obj).I(((mi8) obj2).a.S);
                break;
            default:
                ((eig) obj).y((lxd) obj2);
                break;
        }
    }

    @Override // defpackage.bqb
    public final void n(tw7 tw7Var) {
        s98 s98Var = (s98) this.b;
        if (tw7Var instanceof rw7) {
            qq8 qq8Var = s98Var.a;
        } else {
            if (tw7Var instanceof sw7) {
                return;
            }
            h9o.p();
        }
    }

    public final void onFailure(Exception exc) {
        ua7 ua7Var = (ua7) this.b;
        ua7Var.c = ap7.a;
        ((zo7) ua7Var.d).a.r(bp7.b);
    }

    public final void onSuccess(Object obj) {
        ((yo7) this.b).invoke(obj);
    }
}

package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.common.util.concurrent.ListenableFuture;
import com.opera.android.custom_views.OperaTextInputEditText;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.uninstall.UninstallSurveyFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.chromium.media.MediaDrmBridge;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class so4 implements xo4, vlf, n5o, OnFailureListener, did, vid, zpd, op5, yyk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ so4(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ so4(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public final void a(ArrayList arrayList) {
        pyl pylVar = (pyl) this.c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (pylVar.b == this.b) {
            if (arrayList != null) {
                HashSet hashSet = new HashSet();
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    hashSet.add(((bre) obj).a);
                }
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    bre breVar = (bre) obj2;
                    if (!hashSet.contains(breVar.a)) {
                        arrayList2.add(breVar);
                    }
                }
                Collections.sort(arrayList2, (au9) pylVar.e);
            }
            hu5 hu5Var = (hu5) pylVar.f;
            if (hu5Var == null) {
                return;
            }
            pylVar.f = null;
            hu5Var.run(arrayList2);
        }
    }

    public final void accept(Object obj) {
        e4j e4jVar;
        npd npdVar = (npd) this.c;
        nod nodVar = (nod) this.d;
        try {
            e4jVar = (e4j) ((ListenableFuture) obj).get();
            z4o.D(e4jVar, "SessionResult must not be null");
        } catch (InterruptedException | ExecutionException e) {
            w7d.L("Session operation failed", e);
            e4jVar = new e4j(e.getCause() instanceof UnsupportedOperationException ? -6 : -1);
        } catch (CancellationException e2) {
            w7d.L("Session operation cancelled", e2);
            e4jVar = new e4j(1);
        }
        xqd.Y0(npdVar, nodVar, this.b, e4jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(nod r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so4.b(nod):void");
    }

    public final void c(ssa ssaVar, int i) {
        byte b = this.a;
        Object obj = this.d;
        int i2 = this.b;
        gid gidVar = (gid) this.c;
        switch (b) {
            case 5:
                qjd qjdVar = (qjd) obj;
                m4j m4jVar = gidVar.n;
                m4jVar.getClass();
                int i3 = m4jVar.a.c;
                lid lidVar = gidVar.c;
                if (i3 >= 2) {
                    ssaVar.P0(lidVar, i, i2, qjdVar.c(true));
                    break;
                } else {
                    ssaVar.r(lidVar, i, i2 + 1, qjdVar.c(true));
                    ssaVar.v(lidVar, i, i2);
                    break;
                }
            default:
                List list = (List) obj;
                lid lidVar2 = gidVar.c;
                z0b z0bVarP = h1b.p();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    z0bVarP.c(((qjd) list.get(i4)).c(true));
                }
                ssaVar.v0(lidVar2, i, i2, new k14(z0bVarP.g()));
                break;
        }
    }

    @Override // defpackage.yyk
    public final Object execute() {
        ks3 ks3Var = (ks3) this.c;
        ((x77) ks3Var.d).n((dp2) this.d, this.b + 1, false);
        return null;
    }

    public final Object g(Object obj) {
        Bitmap bitmapA;
        Object obj2;
        int identifier;
        wz5 wz5Var = (wz5) this.c;
        CharSequence charSequence = (CharSequence) this.d;
        String str = wz5Var.a;
        String str2 = wz5Var.c;
        nhj nhjVar = new nhj();
        nhjVar.a = wz5Var;
        nhjVar.b = str;
        nhjVar.e = charSequence;
        nhjVar.h = IconCompat.c(this.b, wz5Var);
        Intent intentB = mdb.b(wz5Var);
        intentB.setAction(str2);
        nhjVar.c = new Intent[]{intentB};
        if (TextUtils.isEmpty(nhjVar.e)) {
            qp2.o("Shortcut must have a non-empty label");
            return null;
        }
        Intent[] intentArr = nhjVar.c;
        if (intentArr == null || intentArr.length == 0) {
            qp2.o("Shortcut must have an intent");
            return null;
        }
        Intent intentCreateShortcutResultIntent = ((ShortcutManager) wz5Var.getSystemService(ShortcutManager.class)).createShortcutResultIntent(nhjVar.a());
        if (intentCreateShortcutResultIntent == null) {
            intentCreateShortcutResultIntent = new Intent();
        }
        Intent[] intentArr2 = nhjVar.c;
        intentCreateShortcutResultIntent.putExtra("android.intent.extra.shortcut.INTENT", intentArr2[intentArr2.length - 1]).putExtra("android.intent.extra.shortcut.NAME", nhjVar.e.toString());
        IconCompat iconCompat = nhjVar.h;
        if (iconCompat != null) {
            Context context = nhjVar.a;
            if (iconCompat.a == 2 && (obj2 = iconCompat.b) != null) {
                String str3 = (String) obj2;
                if (str3.contains(":")) {
                    String str4 = str3.split(":", -1)[1];
                    String str5 = str4.split("/", -1)[0];
                    String str6 = str4.split("/", -1)[1];
                    String str7 = str3.split(":", -1)[0];
                    if (!"0_resource_name_obfuscated".equals(str6) && iconCompat.e != (identifier = IconCompat.g(context, iconCompat.f()).getIdentifier(str6, str5, str7))) {
                        iconCompat.e = identifier;
                    }
                }
            }
            int i = iconCompat.a;
            if (i == 1) {
                bitmapA = (Bitmap) iconCompat.b;
            } else {
                if (i == 2) {
                    try {
                        intentCreateShortcutResultIntent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context.createPackageContext(iconCompat.f(), 0), iconCompat.e));
                        return intentCreateShortcutResultIntent;
                    } catch (PackageManager.NameNotFoundException e) {
                        sjn.l("Can't find package ", iconCompat.b, e);
                        return null;
                    }
                }
                if (i != 5) {
                    qp2.o("Icon type not supported for intent shortcuts");
                    return null;
                }
                bitmapA = IconCompat.a((Bitmap) iconCompat.b);
            }
            intentCreateShortcutResultIntent.putExtra("android.intent.extra.shortcut.ICON", bitmapA);
        }
        return intentCreateShortcutResultIntent;
    }

    @Override // defpackage.xo4
    public final PendingResult m(RemoteMediaClient remoteMediaClient) {
        zo4 zo4Var = (zo4) this.c;
        MediaQueueItem[] mediaQueueItemArr = (MediaQueueItem[]) this.d;
        int[] iArr = zo4Var.l;
        int length = iArr.length;
        int i = this.b;
        return remoteMediaClient.queueInsertItems(mediaQueueItemArr, i < length ? iArr[i] : 0, (JSONObject) null);
    }

    public final void onFailure(Exception exc) {
        zzb zzbVar = (zzb) this.c;
        tzb tzbVar = (tzb) this.d;
        if (zzbVar.d != this.b) {
            return;
        }
        zzbVar.H();
        ks3.B("Failed to install language", String.format(Locale.ROOT, "language: %s, exception: %s", tzbVar.a, exc));
        zzbVar.I();
    }

    public final void run(long j) {
        byte[] bArr = (byte[]) this.c;
        byte[] bArr2 = (byte[]) this.d;
        UUID uuid = MediaDrmBridge.n;
        N.Mf7HZHqV(j, bArr, this.b, bArr2);
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        Object obj = this.d;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 1:
                cn5 cn5Var = (cn5) obj2;
                dn5 dn5Var = (dn5) obj;
                if (z != dn5Var.e) {
                    dn5Var.e = z;
                    ((x93) cn5Var.c.b).notifyItemChanged(i);
                    break;
                }
                break;
            default:
                UninstallSurveyFragment uninstallSurveyFragment = (UninstallSurveyFragment) obj2;
                clm clmVar = ((dlm) obj).a;
                rlm rlmVarI0 = uninstallSurveyFragment.I0();
                String strValueOf = null;
                strValueOf = null;
                strValueOf = null;
                if (z && clmVar.a && UninstallSurveyFragment.H0((nlm) uninstallSurveyFragment.I0().c.g()) != null) {
                    pt1 pt1Var = uninstallSurveyFragment.s;
                    strValueOf = String.valueOf(((OperaTextInputEditText) ((b7k) ((vs) ((vs) (pt1Var != null ? pt1Var : null).f).d).d).c).getText());
                }
                rlmVarI0.h(i, strValueOf, z);
                if (!clmVar.a || !z) {
                    uninstallSurveyFragment.J0();
                    break;
                }
                break;
        }
    }
}

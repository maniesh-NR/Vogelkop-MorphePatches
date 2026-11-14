package defpackage;

import android.content.ContextWrapper;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mhj implements hrl {
    public final Object a;

    public mhj(ContextWrapper contextWrapper, ShortcutInfo shortcutInfo) {
        ecg[] ecgVarArr;
        nhj nhjVar = new nhj();
        this.a = nhjVar;
        nhjVar.a = contextWrapper;
        nhjVar.b = shortcutInfo.getId();
        shortcutInfo.getPackage();
        Intent[] intents = shortcutInfo.getIntents();
        nhjVar.c = (Intent[]) Arrays.copyOf(intents, intents.length);
        nhjVar.d = shortcutInfo.getActivity();
        nhjVar.e = shortcutInfo.getShortLabel();
        nhjVar.f = shortcutInfo.getLongLabel();
        nhjVar.g = shortcutInfo.getDisabledMessage();
        shortcutInfo.getDisabledReason();
        nhjVar.j = shortcutInfo.getCategories();
        PersistableBundle extras = shortcutInfo.getExtras();
        tyc tycVar = null;
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            ecgVarArr = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            ecgVarArr = new ecg[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i3 = i2 + 1;
                sb.append(i3);
                PersistableBundle persistableBundle = extras.getPersistableBundle(sb.toString());
                String string = persistableBundle.getString("name");
                String string2 = persistableBundle.getString("uri");
                String string3 = persistableBundle.getString("key");
                boolean z = persistableBundle.getBoolean("isBot");
                boolean z2 = persistableBundle.getBoolean("isImportant");
                ecg ecgVar = new ecg();
                ecgVar.a = string;
                ecgVar.b = null;
                ecgVar.c = string2;
                ecgVar.d = string3;
                ecgVar.e = z;
                ecgVar.f = z2;
                ecgVarArr[i2] = ecgVar;
                i2 = i3;
            }
        }
        nhjVar.i = ecgVarArr;
        shortcutInfo.getUserHandle();
        shortcutInfo.getLastChangedTimestamp();
        if (Build.VERSION.SDK_INT >= 30) {
            shortcutInfo.isCached();
        }
        shortcutInfo.isDynamic();
        shortcutInfo.isPinned();
        shortcutInfo.isDeclaredInManifest();
        shortcutInfo.isImmutable();
        ((nhj) this.a).n = shortcutInfo.isEnabled();
        shortcutInfo.hasKeyFieldsOnly();
        nhj nhjVar2 = (nhj) this.a;
        if (shortcutInfo.getLocusId() != null) {
            LocusId locusId = shortcutInfo.getLocusId();
            jpo.m(locusId, "locusId cannot be null");
            String id = locusId.getId();
            if (TextUtils.isEmpty(id)) {
                qp2.o("id cannot be empty");
                throw null;
            }
            tycVar = new tyc(id);
        }
        nhjVar2.k = tycVar;
        ((nhj) this.a).l = shortcutInfo.getRank();
        ((nhj) this.a).m = shortcutInfo.getExtras();
    }

    public mhj(grl grlVar) {
        this.a = new irl(this, grlVar);
    }

    public final void a(arl arlVar) {
        arlVar.a.addCallback((irl) this.a);
    }

    public final void onCancel() {
    }
}

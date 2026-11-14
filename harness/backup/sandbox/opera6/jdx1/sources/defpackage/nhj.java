package defpackage;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Set;

/* loaded from: classes.dex */
public final class nhj {
    public Context a;
    public String b;
    public Intent[] c;
    public ComponentName d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public IconCompat h;
    public ecg[] i;
    public Set j;
    public tyc k;
    public int l;
    public PersistableBundle m;
    public boolean n = true;

    public final ShortcutInfo a() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.e).setIntents(this.c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(fr3.f0(iconCompat, this.a));
        }
        if (!TextUtils.isEmpty(this.f)) {
            intents.setLongLabel(this.f);
        }
        if (!TextUtils.isEmpty(this.g)) {
            intents.setDisabledMessage(this.g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.l);
        PersistableBundle persistableBundle = this.m;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        ecg[] ecgVarArr = this.i;
        if (ecgVarArr != null && ecgVarArr.length > 0) {
            int length = ecgVarArr.length;
            Person[] personArr = new Person[length];
            for (int i = 0; i < length; i++) {
                ecg ecgVar = this.i[i];
                ecgVar.getClass();
                personArr[i] = ic4.O(ecgVar);
            }
            intents.setPersons(personArr);
        }
        tyc tycVar = this.k;
        if (tycVar != null) {
            intents.setLocusId(tycVar.b);
        }
        intents.setLongLived(false);
        if (Build.VERSION.SDK_INT >= 33) {
            t8.W(intents);
        }
        return intents.build();
    }
}

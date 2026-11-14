package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class mi9 {
    public final /* synthetic */ byte a;
    public List b;
    public boolean c;

    public mi9(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                break;
            default:
                this.c = true;
                this.b = Collections.singletonList(null);
                break;
        }
    }

    public mi9(ArrayList arrayList) {
        this.a = (byte) 0;
        this.c = false;
        this.b = arrayList;
    }

    public mi9(ArrayList arrayList, boolean z) {
        this.a = (byte) 1;
        if (arrayList.isEmpty()) {
            this.b = Collections.EMPTY_LIST;
        } else {
            this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.c = z;
    }

    public static mi9 a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList.add(bundle2 != null ? new bnd(null, bundle2, Collections.EMPTY_LIST) : null);
            }
        }
        return new mi9(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.b;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= size) {
                        z = true;
                    } else {
                        bnd bndVar = (bnd) list.get(i);
                        if (bndVar != null && bndVar.e()) {
                            i++;
                        }
                    }
                }
                return z1m.m(sb, z, " }");
            default:
                return super.toString();
        }
    }
}

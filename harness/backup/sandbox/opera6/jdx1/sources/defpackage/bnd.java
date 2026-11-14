package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bnd {
    public final Bundle a;
    public final String b;
    public final List c;

    public bnd(String str, Bundle bundle, List list) {
        this.a = bundle;
        this.b = str;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.c = Collections.unmodifiableList(arrayList);
    }

    public final HashSet a() {
        ArrayList<String> stringArrayList = this.a.getStringArrayList("allowedPackages");
        return stringArrayList != null ? new HashSet(stringArrayList) : new HashSet();
    }

    public final ArrayList b() {
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.a;
        ArrayList arrayListW = i >= 34 ? t8.w(bundle, "controlFilters") : bundle.getParcelableArrayList("controlFilters");
        return arrayListW != null ? new ArrayList(arrayListW) : new ArrayList();
    }

    public final ArrayList c() {
        ArrayList<String> stringArrayList = this.a.getStringArrayList("groupMemberIds");
        return stringArrayList != null ? new ArrayList(stringArrayList) : new ArrayList();
    }

    public final String d() {
        return this.a.getString("id");
    }

    public final boolean e() {
        return (TextUtils.isEmpty(d()) || TextUtils.isEmpty(this.a.getString("name")) || b().contains(null)) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(d());
        sb.append(", groupMemberIds=");
        sb.append(c());
        sb.append(", name=");
        Bundle bundle = this.a;
        sb.append(bundle.getString("name"));
        sb.append(", descr  iption=");
        sb.append(bundle.getString(NotificationCompat.CATEGORY_STATUS));
        sb.append(", iconUri=");
        String string = bundle.getString("iconUri");
        sb.append(string == null ? null : Uri.parse(string));
        sb.append(", isEnabled=");
        sb.append(bundle.getBoolean("enabled", true));
        sb.append(", isSystemRoute=");
        sb.append(bundle.getBoolean("isSystemRoute", false));
        sb.append(", isDynamicGroupRoute=");
        sb.append(bundle.getBoolean("isDynamicGroupRoute", false));
        sb.append(", connectionState=");
        sb.append(bundle.getInt("connectionState", 0));
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(b().toArray()));
        sb.append(", playbackType=");
        sb.append(bundle.getInt("playbackType", 1));
        sb.append(", playbackStream=");
        sb.append(bundle.getInt("playbackStream", -1));
        sb.append(", deviceType=");
        sb.append(bundle.getInt("deviceType"));
        sb.append(", volume=");
        sb.append(bundle.getInt("volume"));
        sb.append(", volumeMax=");
        sb.append(bundle.getInt("volumeMax"));
        sb.append(", volumeHandling=");
        sb.append(bundle.getInt("volumeHandling", 0));
        sb.append(", presentationDisplayId=");
        sb.append(bundle.getInt("presentationDisplayId", -1));
        sb.append(", extras=");
        sb.append(bundle.getBundle("extras"));
        sb.append(", isValid=");
        sb.append(e());
        sb.append(", minClientVersion=");
        sb.append(bundle.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(bundle.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb.append(", isVisibilityPublic=");
        sb.append(bundle.getBoolean("isVisibilityPublic", true));
        sb.append(", allowedPackages=");
        sb.append(Arrays.toString(a().toArray()));
        sb.append(", requiredPermissions=");
        sb.append(this.c);
        sb.append(", routingControllerId=");
        return z1m.l(sb, this.b, " }");
    }
}

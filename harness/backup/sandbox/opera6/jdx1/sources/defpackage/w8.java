package defpackage;

import android.media.MediaRoute2Info;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class w8 {
    public static tw2 a(int i, int i2, int i3, int i4, int i5) {
        return new tw2(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(false).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(false).setRowTitle(null).setColumnTitle(null).setSortDirection(i5).build(), (byte) 3);
    }

    public static void b(igi igiVar, MediaRoute2Info mediaRoute2Info) {
        List<Set> requiredPermissions = mediaRoute2Info.getRequiredPermissions();
        igiVar.f = new ArrayList();
        for (Set set : requiredPermissions) {
            List list = (List) igiVar.f;
            HashSet hashSet = new HashSet(set.size());
            for (Object obj : set) {
                Objects.requireNonNull(obj);
                hashSet.add(obj);
            }
            list.add(Collections.unmodifiableSet(hashSet));
        }
    }

    public static AccessibilityNodeInfo.AccessibilityAction c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
    }

    public static int d(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        return collectionItemInfo.getSortDirection();
    }
}

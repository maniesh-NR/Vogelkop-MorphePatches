package defpackage;

import android.content.Context;
import android.os.StrictMode;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ojm {
    public static final /* synthetic */ int a = 0;

    public static int[] a(ListAdapter listAdapter, ListView listView) {
        View view;
        Set set = Collections.EMPTY_SET;
        AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-2, -2);
        int[] iArr = {0, 0};
        View[] viewArr = new View[listAdapter.getViewTypeCount()];
        for (int i = 0; i < listAdapter.getCount(); i++) {
            int itemViewType = listAdapter.getItemViewType(i);
            if (itemViewType < 0) {
                view = listAdapter.getView(i, null, listView);
            } else {
                view = listAdapter.getView(i, viewArr[itemViewType], listView);
                viewArr[itemViewType] = view;
            }
            view.setLayoutParams(layoutParams);
            view.measure(0, 0);
            if (!set.contains(Integer.valueOf(itemViewType))) {
                iArr[0] = Math.max(iArr[0], view.getMeasuredWidth());
            }
            iArr[1] = view.getMeasuredHeight() + iArr[1];
        }
        return iArr;
    }

    public static File b(Context context) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            File file = new File(context.getFilesDir(), "images");
            if (file.exists() || file.mkdir()) {
                return file;
            }
            throw new IOException("Folder cannot be created.");
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}

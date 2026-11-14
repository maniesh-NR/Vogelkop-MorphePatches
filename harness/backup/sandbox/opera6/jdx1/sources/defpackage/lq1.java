package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* loaded from: classes.dex */
public final class lq1 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lq1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                nq1 nq1Var = (nq1) obj;
                qq1 qq1Var = nq1Var.G;
                qq1Var.setSelection(i);
                if (qq1Var.getOnItemClickListener() != null) {
                    qq1Var.performItemClick(view, i, nq1Var.D.getItemId(i));
                }
                nq1Var.dismiss();
                break;
            case 1:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) obj;
                ListPopupWindow listPopupWindow = materialAutoCompleteTextView.e;
                materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(i < 0 ? !listPopupWindow.B.isShowing() ? null : listPopupWindow.c.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !listPopupWindow.B.isShowing() ? null : listPopupWindow.c.getSelectedView();
                        i = !listPopupWindow.B.isShowing() ? -1 : listPopupWindow.c.getSelectedItemPosition();
                        j = !listPopupWindow.B.isShowing() ? Long.MIN_VALUE : listPopupWindow.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(listPopupWindow.c, view, i, j);
                }
                listPopupWindow.dismiss();
                break;
            case 2:
                ((SearchView) obj).l(i);
                break;
            default:
                eyi eyiVar = (eyi) obj;
                int[] iArr = {i};
                if (!eyiVar.b) {
                    ((wa) eyiVar.c).onResult(iArr);
                    eyiVar.b = true;
                }
                eyiVar.a(false);
                break;
        }
    }
}

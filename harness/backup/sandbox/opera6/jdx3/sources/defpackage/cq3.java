package defpackage;

import android.view.View;
import com.opera.android.bubbleview.BubbleView;
import com.opera.android.custom_views.AccentSelector;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.LineHeaderTextView;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.ThemeSelector;
import com.opera.android.suggestion.ChatSuggestionView;
import com.opera.android.ui.catalog.widget.OperaTextView;
import com.opera.hype.emoji.EmojiTextView;

/* loaded from: classes.dex */
public final class cq3 implements a5n {
    public final /* synthetic */ byte a;
    public final View b;

    public /* synthetic */ cq3(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    public cq3(BubbleView bubbleView, LayoutDirectionLinearLayout layoutDirectionLinearLayout) {
        this.a = (byte) 3;
        this.b = bubbleView;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        yq1 yq1Var = this.b;
        switch (b) {
            case 0:
                return (StylingImageView) yq1Var;
            case 1:
                return (ChatSuggestionView) yq1Var;
            case 2:
                return (EmojiTextView) yq1Var;
            case 3:
                return (BubbleView) yq1Var;
            case 4:
                return (OperaTextView) yq1Var;
            case 5:
                return (AccentSelector) yq1Var;
            case 6:
                return (ThemeSelector) yq1Var;
            default:
                return (LineHeaderTextView) yq1Var;
        }
    }
}

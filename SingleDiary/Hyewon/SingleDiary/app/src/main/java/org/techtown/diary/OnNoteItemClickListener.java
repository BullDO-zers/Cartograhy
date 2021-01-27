package org.techtown.diary;

import android.view.View;

public interface OnNoteItemClickListener {
    public void onItemClick(NoteAdapter.ViewHolder holer, View view, int position);
}

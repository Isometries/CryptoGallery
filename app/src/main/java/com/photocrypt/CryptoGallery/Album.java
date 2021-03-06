package com.photocrypt.CryptoGallery;

/*
 *PhotoCrypt - an encrypted gallery for Android
 *Copyright (C) 2018 Thunder Gabriel <tgabriel@protonmail.com>
 *
 *This program is free software; you can redistribute it and/or modify
 *it under the terms of the GNU General Public License as published by
 *the Free Software Foundation; either version 3 of the License, or
 *(at your option) any later version.
 *
 *This program is distributed in the hope that it will be useful,
 *but WITHOUT ANY WARRANTY; without even the implied warranty of
 *MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *GNU General Public License for more details.
 *
 *You should have received a copy of the GNU General Public License
 *along with this program; if not, see http://www.gnu.org/licenses/.
 */

import android.graphics.Color;
import android.view.View;
import android.widget.ImageButton;

import com.photocrypt.CryptoGallery.Activities.AlbumView;

public class Album {

    private String title;
    private byte[] thumbnail;

    public Album(String title, byte[] thumbnail)
    {
        this.title = title;
        this.thumbnail = thumbnail;
    }

    public String getTitle()
    {
        return this.title;
    }

    public byte[] getThumbnail()
    {
        return this.thumbnail;
    }

    public static class WhenLongClicked implements View.OnLongClickListener{

        private Photo photo;

        public WhenLongClicked(Photo photo)
        {
            this.photo = photo;
        }

        @Override
        public boolean onLongClick(View v)
        {
            if (v instanceof ImageButton) {
                ((ImageButton)v).setColorFilter(Color.argb(150, 255, 255, 255));
                AlbumView.addToQueue(photo);
            }
            return true;
        }
    }
}

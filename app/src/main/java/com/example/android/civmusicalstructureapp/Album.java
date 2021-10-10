package com.example.android.civmusicalstructureapp;

public class Album {

    // Picture of the Albums
    private int mAlbumPictureID = NO_IMAGE_PROVIDED;

    // Name of the Albums
    private String mAlbumName;

    // Albums Type
    private String mAlbumType;

    // Name of the Artist
    private String mArtistName;

    // Name of the Title
    private String mTitleName;

    // Title duration
    private String mTitleDuration;

    private static final int NO_IMAGE_PROVIDED = -1;

    /*
     * Create a new Albums object.
     *
     * @param vAlbName is the corresponding New Albums version name
     * @param vAlbType is the corresponding New Albums Type name
     * @param vAlbPicture image is a drawable resource ID that corresponds to the Albums name
     * */
    public Album(String vAlbName, String vAlbType, int vAlbPictureID) {
        this.mAlbumName = vAlbName;
        this.mAlbumType = vAlbType;
        this.mAlbumPictureID = vAlbPictureID;
    }

    /*
     * Create a new Artist object.
     *
     * @param vArtName is the corresponding Artist name
     * @param vArtPicture image is a drawable resource ID  that corresponds to the Artist
     *
     * */
    public Album (String vArtistName, String vAlbName, String vAlbType) {
        this.mArtistName = vArtistName;
        this.mAlbumName = vAlbName;
        this.mAlbumType = vAlbType;
    }


    /*
     * Create a new Title object.
     *
     * @param mTitleName is the corresponding New Title name
     * @param vTitleDuration is the corresponding Title duration
     * */
    public Album (String vTitleName, String vTitleDuration) {
        this.mTitleName = vTitleName;
        this.mTitleDuration = vTitleDuration;
    }

    /**
    * Get the Album image resource ID
    */
    public int getAlbumPictureID() { return mAlbumPictureID;
    }

    /**
     * Get the New Albums version name
     * @return current Album name
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the New Albums Type name
     */
    public String getAlbumType() {
        return mAlbumType;
    }


    /**
     * Get the Artist name
     * @return current Artist name
     */
    public String getArtistName() { return mArtistName; }

    /**
     * Get the Title name
     * @return current Title name
     */
    public String getTitleName() { return mTitleName;}

    /**
     * Get the Title duration
     */
    public String getTitleDuration() {
        return mTitleDuration;
    }

    /**
     * Get the Album index position
     * @return position
     */
    public Album get() {
        return null;
    }

    /**
     * Return or not there is an image for this word
     *
     * */
    public boolean hasImage (){
        return mAlbumPictureID != NO_IMAGE_PROVIDED;
    }

}

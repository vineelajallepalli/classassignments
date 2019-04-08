 const slideshow = {
    photoList:  ["photo1","photo2","photo3","photo4"],
   currentPhotoIndex: -1,
   playInterval: null,
   
      nextPhoto(){
       if (this.currentPhotoIndex==(this.photoList.length-1)){
       console.log("End of slideshow")
        this.pause()}
       else 
       {this.currentPhotoIndex++;
       console.log(this.photoList[this.currentPhotoIndex]);
    
       }
   },

   prevPhoto(){
       if (this.currentPhotoIndex<0)
       console.log("Beginning of slideshow");
       else { console.log(this. photoList[this.currentPhotoIndex]);
           this.currentPhotoIndex--;
       
       }
   },
   getCurrentPhoto(){
         console.log(this.photoList[this.currentPhotoIndex]);
    },

    play(){
      this.playInterval=setInterval(this.nextPhoto.bind(this),2000)
    },

    pause(){
        clearInterval(this.playInterval)
    }

    
};
slideshow.play()
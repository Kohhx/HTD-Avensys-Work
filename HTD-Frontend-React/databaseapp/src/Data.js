import React, { useState } from "react";

function Data() {

  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");

  const handleSave = () => {
    console.log("Title: ", title);
    console.log("Description: ", description);
  }
  return (
    <div>
      <div>
        Enter title: <input type="text" onChange={(e)=> setTitle(e.target.value)} />
      </div>
      <br />
      <div>
        Enter Description: <br />
        <textarea cols="30" rows="10" onChange={(e)=> setDescription(e.target.value)}></textarea>
      </div>
      <br />
      <button onClick={handleSave}>Save</button>
    </div>
  );
}

export default Data;

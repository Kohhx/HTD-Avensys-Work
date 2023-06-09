import React, { useState, useEffect } from "react";
import { db } from "./firebase";

function Data() {
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");
  const [data, setData] = useState([]);

  const handleSave = () => {
    const newData = {
      title,
      description,
    };
    db.collection("mydata")
      .add(newData)
      .then(() => {
        console.log("Data has been added!");
        setTitle("");
        setDescription("");
      })
      .catch((error) => alert(error.message));
  };

  useEffect(() => {
    db.collection("mydata").onSnapshot((snapshot) => {
      const dataGet = snapshot.docs.map((doc) => {
        return {
          id: doc.id,
          ...doc.data(),
        };
      });

      setData(dataGet);
    });
  }, []);

  return (
    <div className="container ">
      <h1>Course Database</h1>
      <div>
        Enter title: <br />
        <input
          type="text"
          value={title}
          onChange={(e) => setTitle(e.target.value)}
        />
      </div>
      <br />
      <div>
        Enter Description: <br />
        <textarea
          cols="30"
          rows="10"
          onChange={(e) => setDescription(e.target.value)}
          value={description}
        ></textarea>
      </div>
      <br />
      <button className="btn btn-success" onClick={handleSave}>Save</button>

      <table className="table mt-4">
        <thead>
          <tr>
            <th>No.</th>
            <th>Title</th>
            <th>Description</th>
          </tr>
        </thead>
        <tbody className="table-group-divider">
          {data.map((item, index) => {
            return (
              <tr key={index}>
                <td>{index + 1}</td>
                <td>{item.title}</td>
                <td>{item.description}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}

export default Data;

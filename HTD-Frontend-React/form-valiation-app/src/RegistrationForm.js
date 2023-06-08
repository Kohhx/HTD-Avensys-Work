import React from "react";
import { useFormik } from "formik";

function RegistrationForm() {
  const formik = useFormik({
    initialValues: {
      username: "",
      password: "",
      email: "",
    },
    validate: (data) => {
      console.log(data);

      // Declare error object to store all the error message
      let errors = {};

      if (!data.username) {
        errors.username = "Username is required";
      }

      if (!data.password) {
        errors.password = "Password is required";
      }

      if (
        data.password &&
        (data.password.length > 8 || data.password.length < 2)
      ) {
        errors.password = "Password should be more than 3 and less than 8";
      }

      if (!data.email) {
        errors.email = "Email is required";
      }

      // Store in array of error messages
      // let errorsArr = {};

      // for (let input in data) {
      //   errorsArr[input] = [];
      // }

      // if (!data.username) {
      //   errorsArr.username.push("Username is required");
      // }

      // if (!data.password) {
      //   errorsArr.username.push("Password is required");
      // }

      // if (!data.email) {
      //   errorsArr.email.push("Email is required");
      // }

      // console.log(errorsArr);

      return errors;
    },
  });

  console.log(formik);

  return (
    <div className="container mt-5">
      <h1>My React Form</h1>
      <form action="">
        <div className="mb-3">
          <label className="form-label">Username</label>

          {/* // Name attribute is required for formik to work. So formik know which field to update */}
          <input
            type="text"
            name="username"
            className="form-control"
            value={formik.values.username}
            onChange={formik.handleChange}
            onBlur={formik.handleBlur}
          />
          {formik.errors.username && formik.touched.username? (
            <div className="alert alert-danger">{formik.errors.username}</div>
          ) : null}
        </div>
        <div className="mb-3">
          <label htmlFor="" className="form-label">
            Password
          </label>
          <input
            type="text"
            name="password"
            className="form-control"
            value={formik.values.password}
            onChange={formik.handleChange}
            onBlur={formik.handleBlur}
          />
          {formik.errors.password && formik.touched.password? (
            <div className="alert alert-danger">{formik.errors.password}</div>
          ) : null}
        </div>
        <div className="mb-3">
          <label htmlFor="" className="form-label">
            Email
          </label>
          <input
            type="text"
            name="email"
            className="form-control"
            value={formik.values.email}
            onChange={formik.handleChange}
            onBlur={formik.handleBlur}
          />
          {formik.errors.email && formik.touched.email ? (
            <div className="alert alert-danger">{formik.errors.email}</div>
          ) : null}
        </div>
        <button className="btn btn-primary">Submit</button>
      </form>
    </div>
  );
}

export default RegistrationForm;

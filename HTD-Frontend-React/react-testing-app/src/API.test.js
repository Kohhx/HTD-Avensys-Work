import { render, screen, act } from "@testing-library/react";
import API from "./API";
import userEvent from "@testing-library/user-event";

describe("Testing API APP", () => {
  test("Check if length of <li> isat least 1", async() => {
    render(<API />);
    const myData = await screen.findAllByRole("listitem");
    console.log(myData.length)
    expect(myData.length).toBeGreaterThan(0);
    expect(myData.length).toEqual(20);
    expect(myData).toHaveLength(20);
  });

});

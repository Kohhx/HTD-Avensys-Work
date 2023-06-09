import { render, screen, act } from "@testing-library/react";
import State from "./State";
import userEvent from "@testing-library/user-event";

describe("Testing State APP", () => {
  test("Check initial count value is 0 or not", () => {
    render(<State />);
    const value = +screen.getByTestId("countvalue").innerHTML;
    expect(value).toEqual(0);
  });

  test(" Check whether count increases to 1 after the first click", async() => {
    render(<State />);

    const myButton = screen.getByRole("button", {
      name: "Increase",
    });

    act(() => {
      userEvent.click(myButton);
    });

    // await userEvent.click(myButton);
    const value = +screen.getByTestId("countvalue").innerHTML;
    expect(value).toEqual(1);
  });
});

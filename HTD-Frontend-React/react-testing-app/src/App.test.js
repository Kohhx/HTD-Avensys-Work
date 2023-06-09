import { render, screen } from "@testing-library/react";
import App from "./App";

/**
 * Sync testing
 * Test Suite
 */
describe("Testing App components", () => {

  // Test Case 1
  test("Checking whether the App component is returning the message Testing react Code or not", () => {
    render(<App />);

    const myData = screen.getByText("Testing React Code");
    expect(myData).toBeInTheDocument();

    const myData2 = screen.getByText("Hello");
    expect(myData2).toBeInTheDocument();
  });

  // Test Case 2
  test("Checking for text Hello", () => {
    render(<App />);
    const myData2 = screen.getByText("Hello");
    expect(myData2).toBeInTheDocument();
  });
});

/**
 * Async testing
 */
test("Checking whether the App component is returning the message Testing react Code or not using async", async () => {
  render(<App />);
  const myData = await screen.findByText("Testing React Code");
  expect(myData).toBeInTheDocument();
});
